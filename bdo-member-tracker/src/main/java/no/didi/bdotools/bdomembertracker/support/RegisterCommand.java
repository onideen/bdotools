package no.didi.bdotools.bdomembertracker.support;

import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.entities.impl.RoleImpl;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import no.didi.bdotools.bot.BotCommand;
import no.didi.bdotools.domain.Family;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Vegar Engen
 */
public class RegisterCommand implements BotCommand{

    @Override
    public boolean isCommand(String message) {
        Pattern pattern = Pattern.compile("register.*");

        Matcher matcher = pattern.matcher(message);
        return matcher.matches();
    }

    @Override
    public void run(MessageReceivedEvent event) {

        String[] commandArray = event.getMessage().getContent().split(" ");

        if (commandArray.length != 2) {
            System.out.println("Usage: register <FamilyName>");
            return;
        }


                event.getGuild().getController().createRole().queue();
        Family family = Family.builder()
                .discordId(event.getAuthor().getId())
                .name(commandArray[1])
                .build();

        System.out.println(family.toString());
    }
}

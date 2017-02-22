package no.didi.bdotools.gatekeeper.support.command;

import lombok.Getter;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import no.didi.bdotools.bot.BotCommand;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Vegar Engen
 */
@Getter
public class HelloCommand implements BotCommand {

    private List<String> alias = Arrays.asList("Help", "h", "Hel");

    @Override
    public boolean isCommand(String commandString) {
        Pattern pattern = Pattern.compile("h.*");
        Matcher matcher = pattern.matcher(commandString);

        return matcher.matches();
    }

    @Override
    public void run(MessageReceivedEvent commandArray) {
        System.out.println("You got here");
    }
}

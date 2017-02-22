package no.didi.bdotools.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import no.didi.bdotools.bot.BotCommand;

import java.util.List;

/**
 * @author Vegar Engen
 */
@Builder
@Getter
public class CommandListener extends ListenerAdapter {

    @Singular
    private List<BotCommand> commands;

    private CommandListener(List<BotCommand> commands) {
        super();
        this.commands = commands;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String message = event.getMessage().getContent();

        commands.stream()
                .filter(c -> c.isCommand(message))
                .forEach(c -> c.run(event));
    }

}

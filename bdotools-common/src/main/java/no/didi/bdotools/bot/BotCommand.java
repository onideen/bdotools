package no.didi.bdotools.bot;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author Vegar Engen
 */
public interface BotCommand {
    boolean isCommand(String message);
    void run(MessageReceivedEvent commandString);

}

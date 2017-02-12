package no.didi.bdotools.bot;

/**
 * Created by vegar on 2/11/2017.
 */
public interface BotCommand {
    boolean isCommand(String s);
    void run(String[] commandArray);

}

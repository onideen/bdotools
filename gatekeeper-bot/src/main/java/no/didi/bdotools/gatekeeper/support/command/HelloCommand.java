package no.didi.bdotools.gatekeeper.support.command;

import lombok.Getter;
import no.didi.bdotools.bot.BotCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vegar on 2/11/2017.
 */
@Getter
public class HelloCommand implements BotCommand {

    private List<String> alias = Arrays.asList("Help", "h", "Hel");

    @Override
    public boolean isCommand(String s) {
        return alias.contains(s);
    }

    @Override
    public void run(String[] commandArray) {
        System.out.println("You got here");
    }
}

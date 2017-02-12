package no.didi.bdotools.gatekeeper.support;

import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import no.didi.bdotools.bot.BotCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by vegar on 2/11/2017.
 */
@Builder
@Getter
public class CommandListener extends ListenerAdapter {

    @Singular
    private List<BotCommand> commands;


    private CommandListener(List<BotCommand> commands){
        super();
        this.commands = commands;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String[] message = event.getMessage().getContent().split(" ", 1);


        commands.stream()
                .filter(c -> c.isCommand(message[0]))
                .forEach(c -> c.run(message));

    }

}

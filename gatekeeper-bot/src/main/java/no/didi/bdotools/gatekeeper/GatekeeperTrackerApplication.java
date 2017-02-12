package no.didi.bdotools.gatekeeper;

/**
 * Created by vegar on 2/10/2017.
 */
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import no.didi.bdotools.gatekeeper.support.CommandListener;
import no.didi.bdotools.gatekeeper.support.command.HelloCommand;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.LoginException;


@SpringBootApplication
public class GatekeeperTrackerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GatekeeperTrackerApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        String BOT_TOKEN = "MjcwMTMwMjQ1MTU0MjQyNTYy.C1zZ6w.f2Yahj-ozV8H2GPQMNZ9nyPJUq0";


        try {
            JDA api = new JDABuilder(AccountType.BOT)
                    .setToken(BOT_TOKEN)
                    .setBulkDeleteSplittingEnabled(false)
                    .addListener(CommandListener.builder()
                            .command(new HelloCommand())
                            .build()

                    )
                    .buildBlocking();
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RateLimitedException e) {
            e.printStackTrace();
        }
    }
}

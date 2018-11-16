package academy.learnprogramming.console;

import academy.learnprogramming.config.GameConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess the number game!");

        //create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        /*  Other way to create the context using AppConfig.class
        //get number generator bean from context (container)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        //get message generator bean from context (container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        // return messageGenerator messages
        String mainMessage = messageGenerator.getMainMessage();
        String resultMessage = messageGenerator.getResultMessage();

        //log the random number using parameterized logging
        log.info("number = {}", number);

        //Log message generator functions
        log.info("mainMessageMethod: {}", mainMessage);
        log.info("resultMessageMethod: {}", resultMessage);

        //get game bean from context (container)
        Game game = context.getBean(Game.class);
        */

        //close context (container)
        context.close();
    }
}

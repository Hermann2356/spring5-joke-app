package guru.springframework.sfgjokesapp;

import guru.springframework.sfgjokesapp.services.ChuckNorrisJokeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgJokesAppApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(SfgJokesAppApplication.class, args);
        ChuckNorrisJokeServiceImpl service = (ChuckNorrisJokeServiceImpl) context.getBean("chuckNorrisJokeServiceImpl");
        System.out.println("\n" + service.getJoke() + "\n");

    }

}

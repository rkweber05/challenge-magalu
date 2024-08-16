package tech.buildrun.challengemagalu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ChallengeMagaluApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChallengeMagaluApplication.class, args);
    }

}

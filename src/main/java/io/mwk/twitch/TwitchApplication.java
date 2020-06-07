package io.mwk.twitch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@SpringBootApplication
public class TwitchApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwitchApplication.class, args);
    }

    @Bean
    RouterFunction<ServerResponse> topGames(TwitchController twitchController, TwitchService twitchService) {
        return twitchController.topGames(twitchService);
    }

    @Bean
    RouterFunction<ServerResponse> gameStreams(TwitchController twitchController, TwitchService twitchService) {
        return twitchController.gamesStreams(twitchService);
    }

}

package io.mwk.twitch;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RouterFunctions.route;
import static org.springframework.web.servlet.function.ServerResponse.ok;

@Component
public class TwitchController {

    public RouterFunction<ServerResponse> topGames(TwitchService twitchService) {
        return route().GET("/games/top", req -> ok().body(twitchService.topGames()))
            .build();
    }

    public RouterFunction<ServerResponse> gamesStreams(TwitchService twitchService) {
        return route().GET("/streams", req -> ok().body(twitchService.gameStreams(req)))
                .build();
    }

}

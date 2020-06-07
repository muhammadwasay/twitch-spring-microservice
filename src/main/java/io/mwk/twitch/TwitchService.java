package io.mwk.twitch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.function.ServerRequest;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class TwitchService {

    @Autowired
    private WebClient webClient;

    @Value("${clientId}")
    private String clientId;

    Logger logger = LoggerFactory.getLogger(TwitchService.class);

    public Mono<String> topGames() {

        return webClient.get()
                .uri("https://api.twitch.tv/helix/games/top")
                .header("Client-ID", clientId)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> gameStreams(ServerRequest req) {
        Optional<String> gameId = req.param("game_id");
        String base_uir = "https://api.twitch.tv/helix/streams";
        String uri = gameId.isPresent() ? base_uir+"?game_id="+gameId.get() : base_uir;
        return webClient.get()
                .uri(uri)
                .header("Client-ID", clientId)
                .retrieve()
                .bodyToMono(String.class);
    }
}

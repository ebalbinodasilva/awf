package com.awf.integration.ai.aiworking.service;

import com.awf.integration.ai.aiworking.dto.ChatResponse;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.awf.integration.ai.aiworking.dto.ChatRequest;

public class ChatBotServiceImpl implements ChatBotService {

    private final WebClient webClient;

    public ChatBotServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.openai.com/v1").build();
    }

    @Override
    public String sendMessage(String message) {
        ChatRequest request = new ChatRequest();
        request.setPrompt(message);

        ChatResponse response = webClient.post()
                .uri("/engines/davinci-codex/completions")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer YOUR_API_KEY")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(ChatResponse.class)
                .block();

        return response.getChoices().get(0).getText();
    }
}
    


package com.awf.integration.ai.aiworking.service;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class ChatbotService {

    private final OpenAi openAi;

    public ChatbotService(OpenAi openAi) {
        this.openAi = openAi;
    }

    public Mono<String> generateResponse(String prompt) {
        return Mono.fromCallable(() -> openAi.complete(prompt))
                .map(CompletionResponse::getChoices)
                .map(choices -> choices.get(0))
                .map(Choice::getText);
    }
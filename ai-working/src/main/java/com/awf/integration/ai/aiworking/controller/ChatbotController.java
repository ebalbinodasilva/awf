package com.awf.integration.ai.aiworking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awf.integration.ai.aiworking.dto.ChatRequest;
import com.awf.integration.ai.aiworking.service.ChatbotService;

import jakarta.validation.Valid;
import reactor.core.publisher.Mono;

@RestController
public class ChatbotController {
  private final ChatbotService chatbotService;

  public ChatbotController(ChatbotService chatbotService) {
      this.chatbotService = chatbotService;
  }

  @PostMapping("/chat")
  public Mono<String> chat(@Valid @RequestBody ChatRequest request) {
      return chatbotService.generateResponse(request.getPrompt());
  }

}
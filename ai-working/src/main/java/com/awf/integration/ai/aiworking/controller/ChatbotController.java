package com.awf.integration.ai.aiworking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.awf.integration.ai.aiworking.service.ChatBotService;

@RestController
@RequestMapping("/api/chat")
public class ChatbotController {
  private final ChatBotService chatbotService;

    public ChatbotController(ChatBotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        String response = chatbotService.sendMessage(message);
        return ResponseEntity.ok(response);
    }
}
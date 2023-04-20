package com.awf.integration.ai.aiworking.service;

import org.springframework.stereotype.Service;

@Service
public interface ChatBotService {

    String sendMessage(String message);
}
package com.awf.integration.ai.aiworking.dto;
import lombok.Data;

@Data
public class ChatRequest {
    @NotBlank
    private String prompt;
}
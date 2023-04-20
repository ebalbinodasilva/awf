package com.awf.integration.ai.aiworking.dto;

import com.awf.integration.ai.aiworking.entities.Choice;

import java.util.List;

public class ChatResponse {
    private List<Choice> choices;

    public List<Choice> getChoices() {
        return this.choices;
    }
}

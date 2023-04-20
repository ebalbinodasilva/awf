package com.awf.integration.ai.aiworking.dto;

import com.awf.integration.ai.aiworking.entities.Choice;
import com.awf.integration.ai.aiworking.entities.Completion;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
public class ChatResponse {

    private String id;
    private String object;
    private Long created;
    private String model;
    private List<Choice> choices;
    private List<Completion> completions;
}

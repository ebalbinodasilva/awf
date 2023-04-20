package com.awf.integration.ai.aiworking.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Choice {
    private String text;
    private Integer index;
    private Object logprobs;
    private String finishReason;
}

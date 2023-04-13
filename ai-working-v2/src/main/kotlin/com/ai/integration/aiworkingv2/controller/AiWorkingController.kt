package com.ai.integration.aiworkingv2.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/start")
class AiWorkingController {
    @GetMapping(produces = [MediaType.TEXT_PLAIN_VALUE])
    fun index(): Mono<String> {
        return Mono.just("start")
    }
}
package com.loukkyy.springcloudgatewaydemo;

import org.springframework.web.bind.annotation.RequestMapping;

import reactor.core.publisher.Mono;

public class GatewayController {
    @RequestMapping("/fallback")
    public Mono<String> fallback() {
    return Mono.just("fallback");
    }
}

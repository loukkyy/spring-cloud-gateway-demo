package com.loukkyy.springcloudgatewaydemo;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
//     @Bean
// public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//     return builder.routes()
//         .route(p -> p
//             .path("/alien-api/**")
//             .filters(f -> f.rewritePath("/alien-api/(?<segment>.*)", "/api/${segment}"))
//             .uri("http://localhost:7878"))
//         .route(p -> p
//             .host("*.hystrix.com")
//             .filters(f -> f.hystrix(config -> config.setName("mycmd")))
//             .uri("http://httpbin.org:80")).
//         build();
// }
}

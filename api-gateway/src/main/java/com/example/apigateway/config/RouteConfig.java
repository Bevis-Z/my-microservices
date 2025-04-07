package com.example.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("base-service-route", r -> r.path("/base/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://base-service"))
                .route("ai-service-route", r -> r.path("/ai/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://ai-service"))
                .build();
    }
} 
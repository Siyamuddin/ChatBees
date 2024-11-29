package com.UddinSiyam.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/ws/**")
                .allowedOrigins("/topic/public","/ws/**","/app/chat.addUser","/app/chat.sendMessage")  // Update with your front-end URL
                .allowedMethods("*")
                .allowCredentials(true);
    }
}


package com.clayn.mmeserver.configurator;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        String angularUrl = "http://localhost:4200";
        registry.addMapping("/**")
                .allowedOrigins(angularUrl)
                .allowedMethods("GET", "POST");
    }
}

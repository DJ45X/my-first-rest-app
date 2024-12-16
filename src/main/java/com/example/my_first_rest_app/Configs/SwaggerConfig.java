package com.example.my_first_rest_app.Configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("My First REST App")
                        .version("1.0")
                        .description("This is a simple REST API Proof of Concept for RKTU using springdoc-openapi and OpenAPI 3."));
    }
}
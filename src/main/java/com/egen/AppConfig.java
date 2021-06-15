package com.egen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan
@EnableWebMvc
@Slf4j
public class AppConfig extends WebMvcConfigurationSupport {
    //TODO: override addCorsMappings Method to allow cross origin request to API

    @Override
    public void addCorsMappings(CorsRegistry registry){

        log.info("Added Cross Origin Mappings");
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:8080/api/")
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "UPDATE")
                    .allowCredentials(true);
    }
}

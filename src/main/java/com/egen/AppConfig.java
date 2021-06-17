package com.egen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan
@EnableWebMvc
public class AppConfig extends WebMvcConfigurationSupport {
    //TODO: override addCorsMappings Method to allow cross origin request to API
    private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);
    @Override
    public void addCorsMappings(CorsRegistry registry){

        logger.info("Added Cross Origin Mappings");
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:8080/api/")
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "UPDATE")
                    .allowCredentials(true);
    }
}

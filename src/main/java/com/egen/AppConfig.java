package com.egen;

import org.springframework.context.annotation.ComponentScan;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan
@EnableWebMvc
public class AppConfig extends WebMvcConfigurationSupport {

       @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/api/**/*")
                    .allowedOrigins("http://localhost:8080")
                    .allowedMethods("PUT", "DELETE","POST","GET")
                    .allowedHeaders("header1", "header2", "header3")
                    .exposedHeaders("header1", "header2")
                    .allowCredentials(false).maxAge(3600);
        }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}

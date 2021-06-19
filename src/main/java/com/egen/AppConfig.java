package com.egen;

import org.springframework.context.annotation.ComponentScan;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Configuration
@ComponentScan
@EnableWebMvc
public class AppConfig extends WebMvcConfigurationSupport {
	//TODO: override addCorsMappings Method to allow cross origin request to API
//    protected void addCorsMapping(CorsRegistry corsRegistry){
//        log.info("asd");
//        super.addCorsMappings(corsRegistry);

}

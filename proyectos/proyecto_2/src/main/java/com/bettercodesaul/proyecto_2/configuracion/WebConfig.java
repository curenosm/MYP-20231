package com.bettercodesaul.proyecto_2.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
            "/img/**",
            "/css/**",
            "/js/**",
            "/assets/**",
            "/libs/**")
            .addResourceLocations(
                    "classpath:/static/img/",
                    "classpath:/static/css/",
                    "classpath:/static/js/",
                    "classpath:/static/assets/",
                    "classpath:/static/libs/");
    }

}
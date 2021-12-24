package com.shop.erp.config;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import org.springframework.context.annotation.Configuration;
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    /**页面跨域访问Controller过滤*/
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);
        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedMethods("POST","GET","PUT","DELETE")
                .allowedOrigins("*");
    }
}

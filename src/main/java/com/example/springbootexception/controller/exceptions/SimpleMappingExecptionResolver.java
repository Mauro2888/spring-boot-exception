package com.example.springbootexception.controller.exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class SimpleMappingExecptionResolver {

    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExecptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();
        properties.put("java.lang.ArithmeticException","mathError");
        resolver.setExceptionMappings(properties);
        return resolver;
    }
}

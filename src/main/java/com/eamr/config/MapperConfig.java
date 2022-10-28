package com.eamr.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean("estudianteMapper")
    public ModelMapper estudianteMapper(){
        return new ModelMapper();
    }

}

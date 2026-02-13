package com.deepak.Learning.Rest.APIs.config;

import com.deepak.Learning.Rest.APIs.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

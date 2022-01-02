package com.example.springbootplayground.config

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateConfig {

    @Bean
    fun testRestTemplate(builder: RestTemplateBuilder): RestTemplate {
        return builder.build()
    }
}
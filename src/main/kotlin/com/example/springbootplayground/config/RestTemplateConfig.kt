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
    // 여기서 딱 이것만보고 resttemplate 주입 어떻게 받는지 알아야지. 그래야 원리를 알고 있다는 것.
}

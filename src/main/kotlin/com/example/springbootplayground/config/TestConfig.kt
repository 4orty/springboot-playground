package com.example.springbootplayground.config

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TestConfig {
    @Bean
    fun testDI(): TestImplClass {
        return TestImplClass()
    }

//    @Bean
//    fun testDI2(): TestInterface {
//        return TestImplClass()
//    }
}

interface TestInterface {
    fun testFunInTestInterface(): String
}

class TestImplClass : TestInterface {
    override fun testFunInTestInterface(): String {
        return "testFunInTestInterface"
    }
}

package com.example.springbootplayground

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class CircuitTestService(val testRestTemplate: RestTemplate) {

    @CircuitBreaker(name="backendA", fallbackMethod = "fallback")
    fun countSuccess(): String {
        val networkTest = "test"
        return "countSuccess"
    }

    @CircuitBreaker(name="backendA", fallbackMethod = "fallback")
    fun countError(): String {
        val a: String? = testRestTemplate.getForObject("http://localhost:8081", String::class.java)
        return a!!
    }

    @CircuitBreaker(name="backendB", fallbackMethod = "fallback")
    fun timeSuccess(): String {
        return "timeSuccess"
    }

    @CircuitBreaker(name="backendB", fallbackMethod = "fallback")
    fun timeError(): String {
        val a: String? = testRestTemplate.getForObject("http://localhost:8081", String::class.java)
        return a!!
    }

    fun fallback(ex: Exception):String {
        return "fallback"
    }
}

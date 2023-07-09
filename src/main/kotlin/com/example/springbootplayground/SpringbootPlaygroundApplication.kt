package com.example.springbootplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class SpringbootPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<SpringbootPlaygroundApplication>(*args)
}

package com.example.springbootplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<SpringbootPlaygroundApplication>(*args)
}

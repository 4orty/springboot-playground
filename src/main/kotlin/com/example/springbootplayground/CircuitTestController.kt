package com.example.springbootplayground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CircuitTestController(
    val circuitTestService: CircuitTestService
) {
    @GetMapping("/count/success")
    fun countSuccess(): String {
        return circuitTestService.countSuccess()
    }

    @GetMapping("/count/error")
    fun countError(): String {
        return circuitTestService.countError()
    }

    @GetMapping("/time/success")
    fun timeSuccess(): String {
        return circuitTestService.timeSuccess()
    }

    @GetMapping("/time/error")
    fun timeError(): String {
        return circuitTestService.timeError()
    }
}

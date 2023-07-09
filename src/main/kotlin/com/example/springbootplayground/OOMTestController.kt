package com.example.springbootplayground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OOMTestController {
    @GetMapping("/burst-memory")
    fun burstMemory(): Int {
        val m = (0 until 1000000).map { 0 }
        Thread.sleep(10000L)
        println(System.currentTimeMillis())
        println(Runtime.getRuntime().maxMemory())
        println(Runtime.getRuntime().totalMemory())
        return m.size
    }
}

package com.example.springbootplayground.service

import com.example.springbootplayground.config.TestInterface
import org.springframework.stereotype.Service

@Service
class TestDIService(
    val a: TestInterface
) {
    fun why() = a.testFunInTestInterface()
}

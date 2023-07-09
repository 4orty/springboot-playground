package com.example.springbootplayground

// RestController vs Controller
import org.springframework.cache.annotation.Cacheable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class TestController(
    val testRepository: TestRepository
) {
    @GetMapping("/test/{id}")
    @Cacheable("simpleCache")
    fun test(@PathVariable id: Long): Optional<Test> {
        return testRepository.findById(id)
    }
}

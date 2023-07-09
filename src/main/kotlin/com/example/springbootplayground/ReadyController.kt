package com.example.springbootplayground

import com.example.springbootplayground.service.TestDIService
import org.springframework.cache.annotation.Cacheable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.net.InetAddress

@RestController
class ReadyController(
    val testDIService: TestDIService,
    val restTemplate: RestTemplate,
) {
    var a: Int = 0
    @GetMapping("/ready")
    fun ready(): String {
        Thread.sleep(60000L)
        return "ready"
    }

    @GetMapping("/print")
    fun print(): String {
        println("system call print")
        // 아 근데 그냥 4, 1 나오게 구현하면 될 것 같은데.
        if (a % 100 == 0) {
            Thread.sleep(10000L)
        }
        a += 1

        return "print"
    }

    @GetMapping("/resolve")
    fun resolve(): String {
        return InetAddress.getByName("test.test.com").toString()
    }

    @GetMapping("/metrics", "text/plain")
    fun metrics(): String {
        return """
            ethan{} 0 1663635160.002
            # EOF
        """.trimIndent()
    }

    @GetMapping("/why")
    fun why(): String {
        return testDIService.why()
    }

    @GetMapping("/debug")
    fun debug(): String {
        val a = Thread.currentThread().name
//        val a = "debug"
        return a
    }

//    ethan{} 0 1663635189.002
//    ethan{} 1 1663635219.002
//    ethan{} 1 1663635249.002

//    fun test(): String {
//        val a = listOf("test", "asdf")
//        a.firstOrNull{ }
//    }

//    @Suppress("ReturnCount")
//    fun calculateRecoveryMillis(alertId: Long): Long? {
//        val annotations = getAnnotationsByAlertId(alertId)
//        // elvis operator 뒤에 return을 사용하는게 적절한지 모르겠음.
//        // 그리고 지금 type 정보가 너무없음. 사실 많이 쓸 수록 좋은 것 같아.
//        val ok = annotations.firstOrNull { it.newState == "ok" && it.prevState == "alerting" } ?: return null
//        val alerting = annotations.firstOrNull { it.newState == "alerting" } ?: return null
//
//        return ok.time - alerting.timeEnd
//    }
}

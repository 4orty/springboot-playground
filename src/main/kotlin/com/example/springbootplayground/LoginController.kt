package com.example.springbootplayground

import com.example.springbootplayground.service.KoreaLoginService
import com.example.springbootplayground.service.LoginService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

// Controller랑 Service는 꼭 1:1 이어야할까?

@RestController
class LoginController(
    // JapanLoginService, KoreaLoginService 두 가지가 타입이 있는 경우 이렇게 Autowired를 할 수 없다는 에러가 난다.
    // 런타임에서 결정해주고 싶은데, 어떻게 해야될까? 어떻게 사용하고 있을까 interface로 사용할 경우.
    // 아 이거 쉽지 않네.. prometheus는 이거 어떻게 해결했지? MeterRegistry.

    // 실제로 login service에 어떤 값이 들어가는지 알고싶으면 어떻게할까?
    private val loginService: LoginService
) {
    init {
        println("init block!!")
        with("test") {
            toString()
        }
        "test".apply {
        }
        run {
        }
        apply {
        }
        "test".run {}
        "test".let {}
        "test".also {}
        println(loginService.javaClass.kotlin.qualifiedName)
        println(loginService::class.simpleName)
        if (loginService is LoginService) {
            println("loginService is LoginService")
        }
        if (loginService is KoreaLoginService) {
            println("loginService is KoreaLoginService")
        }
    }

    @PostMapping("/login")
    fun login(): String = loginService.login() // 구현체에 따라 다른 결과가 return 된다.
}

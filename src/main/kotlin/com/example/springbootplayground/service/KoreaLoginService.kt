package com.example.springbootplayground.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

// 내수는 ID, PW만 확인한다.
// korealoginservice랑 loginservice interface랑 같은 package에 있기 때문에 import를 하지 않았는데, 실제로 interface랑 구현체는
// 같이 있는게 맞을까 따로 있는게 맞을까? 다른 usecase를 살펴보자.
@Service
@Profile("default")
class KoreaLoginService : LoginService {

    final override fun login(): String = "korea login service"

    fun koreaLogin(): String = "korea only"
}

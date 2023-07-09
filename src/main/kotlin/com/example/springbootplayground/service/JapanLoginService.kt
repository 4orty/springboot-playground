package com.example.springbootplayground.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

// 일본은 ID, PW 확인 + 추가 로직.
// JapanLoginService와 KoreaLoginService가 같은 package에 있어야 할까?
// Japan은 Japan Package로, Korea는 Korea Package로 만들면 더 좋을 것 같다.
// 응집도가 높아진다. 그 증거가 import문에서 나온다.
// 코틀린에서는 상속과 구현이 : 콜론으로 같다. 구별하는 방법은 LoginService() 이렇게되어있으면 상속, LoginService면 구현.
@Service
@Profile("japan")
class JapanLoginService : LoginService {

    // val 불변일때는 데이터 변경하는 것도 만들어줘야한다. dataclass에서 copy를 제공하는 것 처럼.
    // 함수명을 지을때, class 이름이랑 연관지어서 마치 책을 읽듯이 읽히게 만드는 것도 좋아보인다.
//    fun japanLogin(): String = "japan login"

    // kotlin에서 한 줄이면 중괄호 생략이 가능하다.
    override fun login(): String = "japan login service"
}

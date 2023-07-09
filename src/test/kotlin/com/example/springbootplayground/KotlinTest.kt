package com.example.springbootplayground

import com.example.springbootplayground.different.Different
import io.kotest.core.spec.style.FunSpec

class KotlinTest : FunSpec({
    test("test") {
        val a = listOf(Person("ethan", 31), Person("ethan2", 41))
        val b = a.associateBy { it.name }
        println(b)
        val c = a.associateBy({ it.name }, { it.age })
        println(c)
        // 일단 여기서 different를 가져와보자. import를 해야되잖아? 아.. 근데 무조건 import를 해야되네.
        // 애초에 암시적으로 안되는데? 음.. 아 그럼 이렇게 생각해보자. Different가 다른 package를 가지고오는거야
        // 여기 보면 지금 nestedDiff package는 전혀 필요가 없음. 분명 D의 type은 nestedDiff인데.
        val d = Different(10)
        d.returnNestedDiff()
    }
})

data class Person (
    val name: String,
    val age: Int
)

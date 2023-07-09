// package com.example.springbootplayground.service
//
// class AsdfService {
//
//    fun getA() = "a"
//    // public member 함수를 해당 클래스에서 재활용하는건 괜찮은가 아닌가? -> 일단 괜찮다라고 생각함. 그렇게 구현되어있는 예시가 많다.
//    fun takeIfWithLet() = getA().let { priorities ->
//        priorities.filter {
//            // 여기서 in을 문법적으로 공부해두기.
//            "a" in t.name
//        }.takeIf { it.isNotEmpty() } ?: priorities.filter {
//            it.name in NAMES
//        }
//    }
//
// //    자기 자신의 함수를 호출할때는 with 아니면 run 아니면 apply를 사용하는데, 공식 reference에서는 with는 리턴 값을 사용하지 말라고 권고하고 있다.  그리고 apply는 자기 자신을 리턴한다. apply는 주로 함수호출보다는 초기화를 위해 사용한다. let이랑 also는 자기 자신을 다른 함수의 인자로 넘길때 주로 사용한다. 그러니까 it 이겠지. 이 케이스에서는 다른 함수의 인자로 넘기는 것보다 자기 자신의 함수롤 호출하고 있기 때문에 run이 더 적절해 보인다.
//    // takeIf의 가장 적절한 용례라고 볼 수 있을 것 같다. null이 아닌 리턴값을 가져야할때 정말 유용할듯!
//    fun takeIfWithRun() = getA().run {
//        filter { "a" in it.name }.takeIf { it.isNotEmpty() } ?: filter{ it.name in NAMES}
//    }
// }
//
// val NAMES = arrayOf("test")

package com.example.springbootplayground.different

import com.example.springbootplayground.nesteddiff.NestedDiff

class Different(
    val id: Int
) {
    // 이렇게 다른 package의 return 값을 사용하는 것. 음... 생각을 좀 해봐야될 것 같은데?
    // 이걸 사용하는 client 입장에서 어떻게 되는걸까?
    // 이게 그 implentation이랑 api랑 연관이 있는 것 같기도 함.
    // 결국 client 입장에서 compile에는 의존하지 않는데 runtime에는 의존하는 거아님?
    fun returnNestedDiff(): NestedDiff {
        return NestedDiff(id)
    }
}

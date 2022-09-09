package com.lkb.dsal

fun partition(list1: IntArray, list2: IntArray, f: (x: Int) -> Int): List<List<Int>> {
    var sampleInput = 3
    return if (f(sampleInput) == sampleInput) {//x


        emptyList()
    } else if (f(sampleInput) == sampleInput * sampleInput) {//x*x
        emptyList()
    } else if (f(sampleInput) == sampleInput % 2) {//x%2
        emptyList()
    } else {
        emptyList()
    }
}
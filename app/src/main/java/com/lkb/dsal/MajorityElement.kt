package com.lkb.dsal

//Moore's voting algorithm
fun main() {
    val arr = intArrayOf(7, 1, 2, 1, 7, 1, 5, 1)
    val res = majorityElement(arr, arr.size)
    println(res)

}

fun majorityElement(arr: IntArray, n: Int): Int? {
    var resIndex = -1
    var count = 0
    for (i in 0 until n) {
        if (count == 0) {
            resIndex = i
            count++
        } else {
            if (arr[i] == arr[resIndex]) {
                count++
            } else {
                count--
            }
        }
    }
    count = 0
    for (i in 0 until n) {
        if (arr[i] == arr[resIndex]) {
            count++
        }
    }
    return if (count > (n / 2)) arr[resIndex] else null

}
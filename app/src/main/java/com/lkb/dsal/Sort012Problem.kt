package com.lkb.dsal

fun main() {
    var arr = intArrayOf(2, 1, 1, 0, 0, 1, 2, 0, 1, 0,2,2,2,1,0)
    sort012(arr, arr.size).forEach(::println)
}


fun sort012(arr: IntArray, n: Int): IntArray {
    var low = 0
    var mid = 0
    var high = n - 1
    while (high >= mid) {
        when (arr[mid]) {
            0 -> {
                swap(arr, low, mid)
                low++
                mid++
            }
            1 -> {
                mid++
            }
            2 -> {
                swap(arr, mid, high)
                high--
            }
        }
    }
    return arr
}
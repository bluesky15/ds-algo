package com.lkb.dsal
fun swap(arr: IntArray, i: Int, j: Int) {
    var temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}
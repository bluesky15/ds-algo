package com.lkb.dsal

// Kadane's Algorithm

fun main() {
    val arr = intArrayOf(5, -4, 2, -6, 1)
    println(maximumSum(arr, arr.size))
}

fun maximumSum(arr: IntArray, n: Int): Int {
    var currentSum = 0
    var maximumSum = 0
    for (i in 0 until n) {
        currentSum += arr[i]
        if (currentSum > maximumSum) {
            maximumSum = currentSum
        }
        if (currentSum < 0) {
            currentSum = 0
        }
    }
    return maximumSum
}
package com.lkb.dsal

fun main() {
    val arr = intArrayOf(5, 2, -6, 4, -10, 6)
    //slidingWindowMaximum(arr, arr.size, 3)
    //slidingWindowMaximumO(arr, arr.size, 3).forEach(::println)
    var result = slidingWindowMaximumSum(arr, arr.size, 3, 0)
    if (result.isEmpty()) {
        println("No window found")
    } else {
        result.forEach(::println)
    }

}


fun slidingWindowMaximum(arr: IntArray, n: Int, k: Int) {
    var max: Int
    for (i in 0..n - k) {
        max = arr[i]
        for (j in 1 until k) {
            if (arr[i + j] > max) {
                max = arr[i + j]
            }
        }
        println(max)
    }
}

fun slidingWindowMaximumO(arr: IntArray, n: Int, k: Int): MutableList<Int> {
    var deque = ArrayDeque<Int>()
    var result = mutableListOf<Int>()

    for (i in 0 until n) {
        // window shift happened and element is out of the window
        if (deque.isNotEmpty() && deque.first() == i - k) {
            deque.removeFirst()
        }
        // when any element is greater that items present in the last side of the queue
        while (deque.isNotEmpty() && arr[deque.last()] < arr[i]) {
            deque.removeLast()
        }
        //add index to the dequeue
        deque.add(i)

        if (i >= k - 1) {
            result.add(arr[deque.first()])
        }
    }

    return result
}


fun slidingWindowMaximumSum(arr: IntArray, n: Int, k: Int, s: Int): ArrayDeque<Int> {
    var deque = ArrayDeque<Int>()   //O(k)
    var dequeElement = ArrayDeque<Int>()//O(k)

    for (i in 0 .. n) {  //O(n)
        if (deque.isNotEmpty() && deque.first() == i - k) {
            if (dequeElement.sum() == 0) {
                return deque
                break
            }
            deque.removeFirst()
            dequeElement.removeFirst()
        }
        deque.add(i)
        dequeElement.add(arr[i])

    }
    deque.removeAll { true }
    return deque
}
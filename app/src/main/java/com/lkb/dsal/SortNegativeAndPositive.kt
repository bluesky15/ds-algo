package com.lkb.dsal

fun main() {

    sortIt(intArrayOf(1,0,0,0,0,-1,1,1,1)).forEach(::println)
}
//Time O(n) space O(1)
fun sortIt(arr: IntArray): IntArray {
    var low = 0
    var high = arr.size - 1
    while (high > low) {
        if(arr[low]>=0 && arr[high]<0){
            swap(arr, low, high)
            low++
            high--
        }
        if (arr[low] <0) {
           low++
        }
        if(arr[high]>=0){
            high--
        }


    }
    return arr
}
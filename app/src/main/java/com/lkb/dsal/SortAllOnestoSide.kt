package com.lkb.dsal

fun main() {
    var arr = intArrayOf(1,0,1,0,1,0,1,1,1,1,0,0,0)
    sortAllOnes(arr,arr.size).forEach(::println)
}

fun sortAllOnes(arr: IntArray,n:Int): IntArray {
    var low = 0
    var high = n-1
    while (high>low){
        if(arr[low]!=0 && arr[high]!=1){
            swap(arr, low, high)
        }
        if(arr[low]==0){
            low++
        }
        if(arr[high]==1){
            high--
        }
    }

    return arr
}
package com.lkb.dsal

fun main() {
var arr = intArrayOf(0,0,0,0,1,1,1,1)
    println(binarySearchItr(arr,1))
}

//time O(log n) space O(log n)
fun binarySearch(arr: IntArray, low: Int, high: Int, key: Int): Int {
    if (low > high) return -1
    var mid = (low + high) / 2
    if (arr[mid] == key) return mid
    return if (key>arr[mid]) {
        binarySearch(arr, mid+1, high, key)
    } else {
        binarySearch(arr, low, mid-1, key)
    }
}


fun binarySearchItr(arr:IntArray,key: Int): Int {
    var low = 0
    var high = arr.size-1
    while(low<=high){
        var mid = (low+high)/2
        if(arr[mid]==key) return mid
        if(key>arr[mid]){
            low = mid+1
        }else{
            high=mid-1
        }
    }
    return -1
}

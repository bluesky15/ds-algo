package com.lkb.dsal


fun main() {
plusOne(intArrayOf(8,9,9)).forEach(::println)
}

fun plusOne(arr: IntArray): IntArray {
    var n = arr.size
    for(i in n-1 downTo 0){
        if(arr[i]!=9){
            arr[i]++
            break
        }else{
            arr[i]=0
        }
    }
    if(arr[0]==0){
        var arr2 = IntArray(n+1)
        arr2[0]=1
        return arr2
    }
    return arr
}
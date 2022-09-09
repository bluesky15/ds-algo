package com.lkb.dsal

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
print(subArray(intArrayOf(10,5,7,1,2,5,3),15))
}

@RequiresApi(Build.VERSION_CODES.N)
fun subArray(arr:IntArray, k:Int): Int {
    var sum = 0
    var result = 0
    val preSum = mutableMapOf<Int,Int>()
    preSum[0] = 1
    for(i in arr.indices){
        sum+=arr[i]
        if(preSum.containsKey(sum-k)){
            result+= preSum[sum-k]!!
        }
        preSum[sum] = preSum.getOrDefault(sum,0)+1
    }
    return result
}
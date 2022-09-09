package com.lkb.dsal

fun main() {
twoSum(intArrayOf(3,2,4),6)?.forEach(::println)
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var numMap = mutableMapOf<Int, Int>()
    var result = mutableListOf<Int>()
    nums.indices.forEach{i-> numMap[nums[i]]=i}
    for (i in nums.indices) {
        var key = target - nums[i]
        if (numMap.containsKey(key) && numMap[key]!=i) {
            result.add(i)
            numMap[key]?.let { result.add(it) }
            break
        }
    }
    return result.toIntArray()
}
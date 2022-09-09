package com.lkb.dsal


data class TreeNode(var value: Int? = null, var left: TreeNode? = null, var right: TreeNode? = null)

fun main() {
    val tree = insertLevelOrder(intArrayOf(1, 2, 3, 4, 5, 6, 7), 0)
    println(tree)
}

fun insertLevelOrder(arr: IntArray, i: Int): TreeNode? {
    var tNode: TreeNode? = null
    if (i < arr.size) {
        tNode = TreeNode(arr[i])
        tNode.left = insertLevelOrder(arr, 2 * i + 1)
        tNode.right = insertLevelOrder(arr, 2 * i + 2)
    }
    return tNode
}

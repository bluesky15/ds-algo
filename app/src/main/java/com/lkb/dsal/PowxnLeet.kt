package com.lkb.dsal

fun main() {
    print(myPow(9.0, 2))
}
//Time O(log n) space O(1)
fun myPow(x: Double, n: Int): Double {
    var x = x
    var res = 1.0
    var nn = n
    if (nn < 0) nn *= -1
    while (nn > 0) {
        if (nn % 2 == 1) {
            res *= x
            nn -= 1
        } else {
            x *= x
            nn /= 2
        }
    }
    if (n < 0) res = 1.0 / res
    return res
}


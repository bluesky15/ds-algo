package com.lkb.dsal
/*
* Binary number
* Addition Subtraction
* Bitwise Operator
* & | ^ ~ >> <<
*  a b & | ^ ~
*  0 0 0 0 0
*  0 1 0 1 1
*  1 0 0 1 1
*  1 1 1 1 0
* odd/even
* swap two number
* 2's complement is 1' complement + 1
* ~ is called 1's complement which means inverse the bits
* */
fun main() {
   // makeBinary(1233333).forEach(::print)
    makeDecimal(10000)
}

fun makeBinary(n:Int): List<Int> {
    var n = n
    var arr = mutableListOf<Int>()
    while (n>0){
        arr.add(n%2)
        n /= 2
    }
    return arr.reversed()
}

fun makeDecimal(binary:Int){
    var binary = binary
    var decimal = 0
    var i =0
    var n = 0
    while (binary!=0){
        var dec = binary%10
        decimal = (decimal+ dec * myPow(2.0,i)).toInt()
        binary /= 10
        i+=1
    }
    println(decimal)
}
package com.lkb.dsal


fun main() {
    print("1234242424242".toInt())
}

fun convertToInt(s:String):Int{
    var num = 0
    var start = 0
    val n: Int = s.length
    var flag = 1
    if(n>1 && s[0]=='-'){
        flag =-1
        start =1
    }
    for (i in start until n)
        num = num * 10 + (s[i].code- '0'.code)

   return num*flag
}
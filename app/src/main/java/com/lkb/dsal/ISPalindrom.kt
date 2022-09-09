package com.lkb.dsal

fun main() {
   println(isPalindrome("venv"))
}

fun isPalindrome(s:String): Boolean {
   var chArr = s.toCharArray()
    var temp = ""
    for(i in chArr.size-1 downTo 0){
        temp+=s[i]
    }
    return s==temp
}
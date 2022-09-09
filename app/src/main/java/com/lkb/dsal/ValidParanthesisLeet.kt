package com.lkb.dsal

import java.util.*

fun main() {
    println(isValid("({[()]})"))
}

fun isValid(s: String): Boolean {
    var stack = Stack<Char>()
    var chArr = s.toCharArray()
    for (i in chArr.indices) {
        if (chArr[i] == '(' || chArr[i] == '{' || chArr[i] == '[') {
            stack.push(chArr[i])
        } else if (stack.isEmpty()) {
            return false
        } else if (chArr[i] == ')' && stack.pop() != '(' ||
            chArr[i] == '}' && stack.pop() != '{' ||
            chArr[i] == ']' && stack.pop() != '['
        ) {
            return false
        }
    }
    return stack.isEmpty()
}
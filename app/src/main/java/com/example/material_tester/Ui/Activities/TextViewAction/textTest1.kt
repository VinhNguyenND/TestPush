package com.example.material_tester.Ui.Activities

import com.example.material_tester.R

fun findNearestNonAlphabeticChars(input: String, position: Int): Pair<Int, Int> {
    // Xác định vị trí xa nhất về bên trái
    var leftNonAlphabeticChar = -1
    var i = position - 1
    while (i >= 0) {
        if (!input[i].isLetter()) {
            leftNonAlphabeticChar = i
            break
        }
        i--
    }
    if (leftNonAlphabeticChar < 0) {
        leftNonAlphabeticChar = position
    }

    // Xác định vị trí xa nhất về bên phải
    var rightNonAlphabeticChar = -1
    i = position + 1
    while (i < input.length) {
        if (!input[i].isLetter()) {
            rightNonAlphabeticChar = i
            break
        }
        i++
    }
    if (rightNonAlphabeticChar < 0 || rightNonAlphabeticChar > input.length - 1) {
        rightNonAlphabeticChar = position
    }

    if (input[position].isLetter()) {
        return Pair(position, position)
    }

    return Pair(leftNonAlphabeticChar, rightNonAlphabeticChar)
}

fun main() {
    var input = "Điều này có thể hữu ích khi bạn muốn thực hiện các tác vụ cụ thể tại một vị trí xác định trên văn bản. "
    val position = 3 // Đây là vị trí của ký tự bạn quan tâm

    val (leftNonAlphabeticChar, rightNonAlphabeticChar) = findNearestNonAlphabeticChars(input, position)

    if (leftNonAlphabeticChar != rightNonAlphabeticChar) {
        val output = input.subSequence(leftNonAlphabeticChar, rightNonAlphabeticChar)
        println(output)
    } else {
        println("Không có ký tự không phải chữ cái xung quanh")
    }
    println((input.length - 1).toString())
}

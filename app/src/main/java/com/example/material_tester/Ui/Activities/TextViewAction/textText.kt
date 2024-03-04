package com.example.material_tester.Ui.Activities

import com.example.material_tester.R

fun findNearestSpaces(input: String, position: Int): Pair<Int, Int> {
    // Xác định vị trí xa nhất về bên trái
    var leftSpace = -1
    var i = position - 1
    while (i >= 0) {
        if (input[i] == ' ') {
            leftSpace = i
            break
        }
        i--
    }
    if (leftSpace < 0) {
        leftSpace = position
    }
    // Xác định vị trí xa nhất về bên phải
    var rightSpace = -1
    i = position + 1
    while (i < input.length) {
        if (input[i] == ' ') {
            rightSpace = i
            break
        }
        i++
    }
    if (rightSpace < 0 || rightSpace > input.length-1) {
        rightSpace = position
    }
    if(input[position].toString()==" "){
        return Pair(position, position);
    }
    return Pair(leftSpace, rightSpace)
}

fun main() {
    var input = "Điều này có thể hữu ích khi bạn muốn thực hiện các tác vụ cụ thể tại một vị trí xác định trên văn bản. "

    val position = 7 // Đây là vị trí của ký tự bạn quan tâm

    val (leftSpace, rightSpace) = findNearestSpaces(input, position)

//    println("Vị trí xa nhất bên trái: $leftSpace")
//    println("Vị trí xa nhất bên phải: $rightSpace")
    if(leftSpace!=rightSpace) {
        val output = input.subSequence(leftSpace, rightSpace);
        println(output);
    }else{
        println("dấu cách lên không có chi");
    }
    println((input.length-1).toString());
}
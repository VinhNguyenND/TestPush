package com.example.material_tester.Ui.Activities.TextViewAction
fun findWordAtPosition(input: String, position: Int): String {
    var start = position
    var end = position

    // Tìm vị trí bắt đầu của từ
    while (start > 0 && input[start - 1].isLetter()&&input[start].isLetter()) {
        start--
    }

    // Tìm vị trí kết thúc của từ
    while (end < input.length - 1 && input[end + 1].isLetter()&&input[end].isLetter()) {
        end++
    }

    // Trích xuất từ từ vị trí bắt đầu đến vị trí kết thúc
    return input.substring(start, end+1 )
}

fun main() {
    val input = "được sử dụng để kiểm tra xem mỗi ký tự có phải là một ký tự trong bảng chữ cái hay không"
    val position = 20 // Vị trí của ký tự bạn quan tâm

    val word = findWordAtPosition(input, position)

    println("Chữ hoàn chỉnh ở vị trí $position là: \"$word\"")
}

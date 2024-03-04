package com.example.material_tester.Ui.Activities.CutomTextView

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class CustomMyText (context: Context, attrs: AttributeSet? = null) : AppCompatTextView(context, attrs) {

    private val cornerRadius = 20f // Bán kính của góc (có thể tùy chỉnh)
    private val borderColor = 0xFF0000FF.toInt() // Màu của khung (màu xanh lam trong ví dụ)

    private val borderPaint = Paint().apply {
        style = Paint.Style.STROKE
        strokeWidth = 5f // Độ rộng của khung (có thể tùy chỉnh)
        color = borderColor
    }

    override fun onDraw(canvas: Canvas) {
        // Vẽ nền và văn bản bình thường
        super.onDraw(canvas)

        // Lấy kích thước TextView
        val width = width.toFloat()
        val height = height.toFloat()

        // Vẽ khung ở top-left và bottom-right
        canvas.drawRoundRect(0f, 0f, cornerRadius * 2, cornerRadius * 2, cornerRadius, cornerRadius, borderPaint)
        canvas.drawRoundRect(width - cornerRadius * 2, height - cornerRadius * 2, width, height, cornerRadius, cornerRadius, borderPaint)
    }
}
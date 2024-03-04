package com.example.material_tester.BottomSheetMaterial

import android.content.res.ColorStateList
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.material_tester.R
import com.example.material_tester.Util.themeColor
import com.example.material_tester.databinding.ActivityBottomBehavierBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.*
import com.google.android.material.shape.MaterialShapeDrawable
import kotlin.LazyThreadSafetyMode.NONE

class bottom_behavier : AppCompatActivity() {
    private lateinit var binding:ActivityBottomBehavierBinding;
    private val behavior:BottomSheetBehavior<FrameLayout> by lazy(NONE) {
            from(binding.backgroundContainer)
    }
     private val backgroundShapeDrawable: MaterialShapeDrawable by lazy(NONE) {
        val backgroundContext = binding.backgroundContainer.context
        MaterialShapeDrawable(
            backgroundContext,
            null,
            com.google.android.material.R.attr.bottomSheetStyle,
            0
        ).apply {
            fillColor = ColorStateList.valueOf(
                backgroundContext.themeColor(com.google.android.material.R.attr.colorPrimarySurface)
            )
            elevation = resources.getDimension(R.dimen.plane_08)
            initializeElevationOverlay(this@bottom_behavier)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomBehavierBinding.inflate(layoutInflater)
        val view=binding.root;
        setContentView(view);
        val view1=findViewById<Button>(R.id.buttonClick);
        view1.setOnClickListener {
         toggle()
        }
        binding.run {
            backgroundContainer.background=backgroundShapeDrawable;
            foregroundContainer.background=backgroundShapeDrawable;
        }
    }
    fun toggle() {
        when {
            behavior.state == STATE_HIDDEN -> open()
            behavior.state == STATE_HIDDEN
                || behavior.state == STATE_HALF_EXPANDED
                || behavior.state == STATE_EXPANDED
                || behavior.state == STATE_COLLAPSED -> close()
        }
    }

    fun open() {
        behavior.state = STATE_HALF_EXPANDED
    }

    fun close() {
        behavior.state = STATE_HIDDEN
    }

}
package com.example.material_tester.Adapt.ViewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.material_tester.Adapt.Interface.onItemClick
import com.example.material_tester.databinding.ItemViewBinding

public class LetterViewHolder(binding: ItemViewBinding):RecyclerView.ViewHolder(binding.root) {
    private val _binding=binding.root;
    fun bind(item: String){
        _binding.run {
            this.text=item;
        }
    }
}
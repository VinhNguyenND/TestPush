package com.example.material_tester.Adapt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import androidx.recyclerview.widget.RecyclerView
import com.example.material_tester.Adapt.Interface.onItemClick
import com.example.material_tester.Adapt.ViewHolder.LetterViewHolder
import com.example.material_tester.databinding.ItemViewBinding


class LetterAdapter(): RecyclerView.Adapter<LetterViewHolder>(){

    private var _list = ('A').rangeTo('Z').toList();
    private val getList get() = _list;
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        val view  = ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false) ;
        return LetterViewHolder(view);
    }

    override fun getItemCount(): Int {
        return getList.size;
    }

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
         holder.bind(getList[position].toString());
    }
    companion object  Accessibility:View.AccessibilityDelegate(){
        override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(host, info)
        }
    }

}
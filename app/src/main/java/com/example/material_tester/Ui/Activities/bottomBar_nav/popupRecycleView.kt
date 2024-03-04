package com.example.material_tester.Ui.Activities.bottomBar_nav

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.material_tester.databinding.ItemArticleBinding
import com.example.material_tester.databinding.ItemViewBinding
import com.example.material_tester.databinding.PopupLayoutBinding

class popupRecycleView(private val listArticle: MutableList<item>,context: Context): RecyclerView.Adapter<popupRecycleView.ArticleViewHolder>(){

    private lateinit var _onClickListener:CommonAdapter
    private val _context=context
    private var _listArticle=listArticle
    fun setClickListener(OnClickListener:CommonAdapter){
        this._onClickListener=OnClickListener
    }
    @SuppressLint("NotifyDataSetChanged")
    fun submitList(listArticle: MutableList<item>){
        this._listArticle=listArticle
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ArticleViewHolder(binding,_onClickListener)
    }

    override fun getItemCount(): Int {
       if(this._listArticle.isEmpty()){
           return 0
       }
        return this._listArticle.size
    }

    override fun onBindViewHolder(holder:ArticleViewHolder , position: Int) {
       holder.bind(this._listArticle[position])
    }
    inner class ArticleViewHolder(private var binding:ItemViewBinding , onClick: CommonAdapter):RecyclerView.ViewHolder(binding.root){
        init {
            binding.root.apply {
                this.setOnClickListener {
                    onClick.setOnClickListener(adapterPosition)
                }
            }
        }
        fun bind(article: item){
             binding.buttonItem.text=article.name
        }
    }
}
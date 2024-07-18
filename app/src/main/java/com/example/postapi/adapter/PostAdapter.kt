package com.example.postapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.postapi.data.ResultPost
import com.example.postapi.databinding.ItemPostBinding

class PostAdapter( private var dataSet: List<ResultPost> = emptyList(),
private val onItemClickListener: (Int) -> Unit
) : RecyclerView.Adapter<CharacteresViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacteresViewHolder {
        val binding =
            ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacteresViewHolder(binding)


    }


    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(holder: CharacteresViewHolder, position: Int) {
        holder.render(dataSet[position])
        holder.itemView.setOnClickListener { onItemClickListener(position) }
    }

    fun updateData(dataSet: List<ResultPost>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

}

class CharacteresViewHolder(val binding: ItemPostBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun render(resultPost: ResultPost) {
        binding.txtTitlePost.text = resultPost.title

    }

}
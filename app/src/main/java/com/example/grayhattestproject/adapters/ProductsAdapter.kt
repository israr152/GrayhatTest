package com.example.grayhattestproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.grayhattestproject.databinding.ListitemProductBinding
import com.example.grayhattestproject.models.Product
import javax.inject.Inject

class ProductsAdapter @Inject constructor() : ListAdapter<Product, RecyclerView.ViewHolder>(DiffCallback) {
    object DiffCallback : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem==newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return VH(
            ListitemProductBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as VH).bindData(currentList[position])
    }

    private inner class VH(private val binding: ListitemProductBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindData(product:Product){
            binding.apply {
                tvName.text = product.name
                tvType.text = product.type
                tvPrice.text = "$${product.price}"

                Glide.with(ivProductImage).load(product.image).into(ivProductImage)
            }
        }
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}
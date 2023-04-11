package com.example.grayhattestproject.repositories

import com.example.grayhattestproject.models.Product
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CartManager @Inject constructor() {
    private var list = arrayListOf<Product>()

    fun addToCart(product: Product){
        MainScope().launch {
            if(!list.contains(product)) {
                list.add(product)
            }
        }
    }
}
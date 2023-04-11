package com.example.grayhattestproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.addCallback
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.grayhattestproject.R
import com.example.grayhattestproject.databinding.ActivityProductDetailsBinding
import com.example.grayhattestproject.models.Product
import com.google.gson.Gson

class ProductDetailsActivity : AppCompatActivity() {
    private val binding : ActivityProductDetailsBinding by lazy {
        ActivityProductDetailsBinding.inflate(layoutInflater)
    }

    private var selectedColor = "color2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        intent.getStringExtra("product")?.let { str->
            if(str.isNotEmpty()){
                initViews(
                    Gson().fromJson(str, Product::class.java)
                )
            }
        }

        onBackPressedDispatcher.addCallback {
            backPressed()
        }

        binding.apply {
            ivBack.setOnClickListener {
                backPressed()
            }

            tvColor1.setOnClickListener {
                selectedColor = "color1"
                invalidateColorViews()
            }
            tvColor2.setOnClickListener {
                selectedColor = "color2"
                invalidateColorViews()
            }
            tvColor3.setOnClickListener {
                selectedColor = "color3"
                invalidateColorViews()
            }
        }
    }

    private fun invalidateColorViews() {
        val colorBackground = ContextCompat.getDrawable(this, R.drawable.color_background)
        val colorBackgroundSelected = ContextCompat.getDrawable(this, R.drawable.color_background_selected)
        when(selectedColor){
            "color1"->{
                binding.apply {
                    tvColor1.background = colorBackgroundSelected
                    tvColor2.background = colorBackground
                    tvColor3.background = colorBackground
                }
            }
            "color2"->{
                binding.apply {
                    tvColor1.background = colorBackground
                    tvColor2.background = colorBackgroundSelected
                    tvColor3.background = colorBackground
                }
            }
            "color3"->{
                binding.apply {
                    tvColor1.background = colorBackground
                    tvColor2.background = colorBackground
                    tvColor3.background = colorBackgroundSelected
                }
            }
        }
    }

    private fun initViews(product: Product) {
        Glide.with(binding.ivImage).load(product.image).into(binding.ivImage)

        binding.tvName.text = product.name
        binding.tvType.text = product.type
        binding.tvDescription.text = product.details
        val priceText ="$${product.price}"
        binding.tvPrice.text = priceText
    }

    private fun backPressed(){
        finish()
    }
}
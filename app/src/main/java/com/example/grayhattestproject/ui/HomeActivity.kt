package com.example.grayhattestproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.grayhattestproject.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initializeTabLayout()
    }

    private fun initializeTabLayout() {
        val titles = arrayListOf("Smart Watch","Casio", "Tisto", "Siko")
        binding.apply {
            brandsTabLayout.apply {
                titles.forEach { t->
                    addTab(newTab().setText(t))
                }
            }
            val adapter = PagerAdapter(this@HomeActivity)
            vpSlider.adapter = adapter
            TabLayoutMediator(brandsTabLayout,vpSlider) { tab,pos->
                tab.text = titles[pos]
            }.attach()
        }
    }

    private inner class PagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity){
        override fun getItemCount(): Int {
            return 4
        }

        override fun createFragment(position: Int): Fragment {
            return ProductsFragment()
        }
    }
}

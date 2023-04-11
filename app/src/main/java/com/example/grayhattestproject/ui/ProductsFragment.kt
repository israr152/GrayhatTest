package com.example.grayhattestproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.grayhattestproject.adapters.ProductsAdapter
import com.example.grayhattestproject.databinding.FragmentProductsBinding
import com.example.grayhattestproject.viewmodels.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class ProductsFragment : Fragment() {
    private var binding : FragmentProductsBinding? = null

    private val homeViewModel : HomeViewModel by activityViewModels()

    @Inject
    lateinit var adapter : ProductsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductsBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        setObserver()
        homeViewModel.fetchProducts()
    }

    private fun setObserver() {
        lifecycleScope.launch {
            homeViewModel.products.observe(viewLifecycleOwner){
                adapter.submitList(it)
            }
        }
    }

    private fun initRecycler() {
        binding?.apply {
            rvProducts.layoutManager = LinearLayoutManager(context)
            rvProducts.adapter = adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
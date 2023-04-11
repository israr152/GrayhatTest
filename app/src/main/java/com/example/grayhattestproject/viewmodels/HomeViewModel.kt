package com.example.grayhattestproject.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.grayhattestproject.models.Product
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private var _products = MutableLiveData<ArrayList<Product>>()
    var products: LiveData<ArrayList<Product>> = _products

    fun fetchProducts() {
        viewModelScope.launch(Dispatchers.IO) {
            val ref = FirebaseDatabase.getInstance().getReference("products")
            ref.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val list = arrayListOf<Product>()
                    for (snap in snapshot.children) {
                        val user = snap.getValue(Product::class.java)
                        if (user != null) {
                            list.add(user)
                        }
                    }
                    _products.postValue(list)
                }

                override fun onCancelled(error: DatabaseError) {
                }
            })
        }
    }

    fun filterProducts(name:String){
        viewModelScope.launch(Dispatchers.IO) {
            val ref = FirebaseDatabase.getInstance().getReference("products")
            ref.addListenerForSingleValueEvent(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val list = arrayListOf<Product>()
                    for (snap in snapshot.children) {
                        val user = snap.getValue(Product::class.java)
                        if (user != null) {
                            if(name.isEmpty() || user.name.lowercase().contains(name.lowercase())){
                                list.add(user)
                            }
                        }
                    }
                    _products.postValue(list)
                }

                override fun onCancelled(error: DatabaseError) {
                }
            })
        }
    }
}
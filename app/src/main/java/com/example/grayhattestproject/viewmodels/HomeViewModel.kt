package com.example.grayhattestproject.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.grayhattestproject.models.Product
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private var _products = MutableLiveData<ArrayList<Product>>()
    var products : LiveData<ArrayList<Product>> = _products

    fun fetchProducts(){
        Log.d("TESTING", "fetchProducts:")
        Firebase.database.getReference("products")
            .addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    Log.d("TESTING", "onDataChange: ${snapshot.children.count()}")
                    val list = arrayListOf<Product>()
                    snapshot.children.forEach {
                        list.add(
                            it.value as Product
                        )
                    }
                    _products.postValue(list)
                }

                override fun onCancelled(error: DatabaseError) {
                }
            })
    }
}
package br.com.siecola.androidproject04.product

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.siecola.androidproject04.persistence.Product

private const val TAG = "ProductListViewModel"

class ProductListViewModel : ViewModel() {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    init {
        getProducts()
    }

    private fun getProducts() {
        Log.i(TAG, "Preparing to request products list")

        Log.i(TAG, "Products list requested")
    }

    override fun onCleared() {
        super.onCleared()
    }

    fun refreshProducts() {
        _products.value = null
        getProducts()
    }

}
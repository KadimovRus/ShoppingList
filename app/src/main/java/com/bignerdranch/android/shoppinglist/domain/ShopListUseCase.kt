package com.bignerdranch.android.shoppinglist.domain

import androidx.lifecycle.LiveData

class ShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun shopList() : LiveData<List<ShopItem>> {
        return shopListRepository.shopList()
    }
}
package com.bignerdranch.android.shoppinglist.domain

class ShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun shopList() : List<ShopItem> {
        return shopListRepository.shopList()
    }
}
package com.bignerdranch.android.shoppinglist.domain

class ShopListItem (private val shopListRepository: ShopListRepository) {
    fun shopItem(shopItemId: Int) : ShopItem {
        return shopListRepository.shopItem(shopItemId)
    }
}
package com.bignerdranch.android.shoppinglist.domain

class ShopListItem (private val shopListRepository: ShopListRepository) {
    fun shopItem() : ShopItem {
        return shopListRepository.shopItem()
    }
}
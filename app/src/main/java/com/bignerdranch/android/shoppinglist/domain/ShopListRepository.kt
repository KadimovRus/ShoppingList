package com.bignerdranch.android.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun shopList() : LiveData<List<ShopItem>>

    fun editShopItem(item: ShopItem)

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun shopItem(shopItemId: Int) : ShopItem
}
package com.bignerdranch.android.shoppinglist.domain

interface ShopListRepository {

    fun shopList() : List<ShopItem>

    fun editShopItem(item: ShopItem)

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun shopItem(shopItemId: Int) : ShopItem
}
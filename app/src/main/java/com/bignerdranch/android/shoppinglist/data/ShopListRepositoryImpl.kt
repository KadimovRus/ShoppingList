package com.bignerdranch.android.shoppinglist.data

import com.bignerdranch.android.shoppinglist.domain.ShopItem
import com.bignerdranch.android.shoppinglist.domain.ShopListRepository
import java.lang.RuntimeException

object ShopListRepositoryImpl : com.bignerdranch.android.shoppinglist.domain.ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementID = 0

    override fun shopList(): List<ShopItem> {
        return shopList.toMutableList()
    }

    override fun editShopItem(item: ShopItem) {
        val oldElement = shopItem(item.id)
        shopList.remove(oldElement)
        addShopItem(item)
    }

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementID++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun shopItem(shopItemId: Int): ShopItem {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }
}
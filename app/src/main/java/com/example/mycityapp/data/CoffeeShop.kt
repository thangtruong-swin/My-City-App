package com.example.mycityapp.data

import androidx.annotation.DrawableRes

data class CoffeeShop(
	val idCoffeeShop: Int,
	val coffeeShopName: String,
	val coffeeShopAddress: String,
	val coffeeShopDescription: String,
	val category: Categories = Categories.CoffeeShops,
	@DrawableRes val imageCoffeeShop: Int
)

package com.example.mycityapp.data

import androidx.annotation.DrawableRes

data class ShoppingCenter(
	val idShoppingCenter: Int,
	val shoppingCenterName: String,
	val shoppingCenterAddress: String,
	val shoppingCenterDescription: String,
	val category: Categories = Categories.ShoppingCenters,
	@DrawableRes val imageShoppingCenter: Int
) {
}
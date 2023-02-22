package com.example.mycityapp.data

import androidx.annotation.DrawableRes

data class Restaurant(
	 val idRestaurant: Int,
   val restaurantName: String,
   val restaurantAddress: String,
   val restaurantDescription: String,
	 val category: Categories = Categories.Restaurants,
	 @DrawableRes val imageRestaurant: Int
	 ) {
}
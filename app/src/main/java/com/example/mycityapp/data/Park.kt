package com.example.mycityapp.data

import androidx.annotation.DrawableRes

data class Park(
	val idPark: Int,
	val ParkName: String,
	val ParkAddress: String,
	val ParkDescription: String,
	val category: Categories = Categories.KidPlaces,
	@DrawableRes val imagePark: Int
)

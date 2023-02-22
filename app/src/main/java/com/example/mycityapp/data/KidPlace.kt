package com.example.mycityapp.data

import androidx.annotation.DrawableRes

data class KidPlace(
	val idKidPlace: Int,
	val kidPlaceName: String,
	val kidPlaceAddress: String,
	val kidPlaceDescription: String,
	val category: Categories = Categories.KidPlaces,
	@DrawableRes val imageKidPlace: Int
)

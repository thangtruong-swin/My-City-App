package com.example.mycityapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycityapp.ui.utils.MyCityContentType
import com.example.mycityapp.ui.utils.MyCityHomeScreen
import com.example.mycityapp.ui.utils.MyCityNavigationType
import com.example.mycityapp.ui.utils.MyCityViewModel


@Composable
fun MyCityApp(
	windowSize: WindowWidthSizeClass,
	modifier: Modifier = Modifier,
) {
	val navigationType: MyCityNavigationType
	val contentType: MyCityContentType
	val viewModel: MyCityViewModel = viewModel()
	val myCityUiState = viewModel.uiState.collectAsState().value
	
	when (windowSize) {
		WindowWidthSizeClass.Compact -> {
			navigationType = MyCityNavigationType.BOTTOM_NAVIGATION
			contentType = MyCityContentType.LIST_ONLY
		}
		WindowWidthSizeClass.Medium -> {
			navigationType = MyCityNavigationType.NAVIGATION_RAIL
			contentType = MyCityContentType.LIST_ONLY
		}
		WindowWidthSizeClass.Expanded -> {
			navigationType = MyCityNavigationType.PERMANENT_NAVIGATION_DRAWER
			contentType = MyCityContentType.LIST_AND_DETAIL
		}
		else -> {
			navigationType = MyCityNavigationType.BOTTOM_NAVIGATION
			contentType = MyCityContentType.LIST_ONLY
		}
	}
	
	MyCityHomeScreen(
		navigationType = navigationType,
		contentType = contentType,
		myCityUiState = myCityUiState,
		onDetailScreenBackPressed = {
		
		},
		modifier = modifier
	)
}
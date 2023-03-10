package com.example.mycityapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycityapp.ui.theme.MyCityAppTheme
import com.example.mycityapp.ui.MyCityApp

class MainActivity : ComponentActivity() {
	@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		
		setContent {
			MyCityAppTheme {
				val windowSize = calculateWindowSizeClass(this)
				
					MyCityApp(
						windowSize = windowSize.widthSizeClass
					)
				
				}
			}
		}
	}

@Preview(showBackground = true, widthDp = 1000)
@Composable
fun DefaultPreview() {
	MyCityAppTheme {
		MyCityApp(
			windowSize = WindowWidthSizeClass.Expanded,
		)
	}
}
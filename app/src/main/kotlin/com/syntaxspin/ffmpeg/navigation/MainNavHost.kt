package com.syntaxspin.ffmpeg.navigation

import android.util.Log

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

import com.syntaxspin.ffmpeg.navigation.routes.HomeRoute
import com.syntaxspin.ffmpeg.platform.LocalMainNavController
import com.syntaxspin.ffmpeg.ui.animations.navigation.NavigationAnimationTransitions
import com.syntaxspin.ffmpeg.ui.screens.home.HomeScreen

import kotlin.reflect.typeOf

@Composable
fun MainNavHost() {
  val navController = LocalMainNavController.current

  NavHost(
    navController = navController,
    startDestination = HomeRoute,
    enterTransition = { NavigationAnimationTransitions.enterTransition },
    exitTransition = { NavigationAnimationTransitions.exitTransition },
    popEnterTransition = { NavigationAnimationTransitions.popEnterTransition },
    popExitTransition = { NavigationAnimationTransitions.popExitTransition },
  ) {
    composable<HomeRoute> {
      HomeScreen()
    }
  }
}

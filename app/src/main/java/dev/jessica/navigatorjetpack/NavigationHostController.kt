package dev.jessica.navigatorjetpack
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.jessica.navigatorjetpack.screens.AddScreen
import dev.jessica.navigatorjetpack.screens.HomeScreen


@Composable
fun NavigatorHostController() {
    var navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Home",
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(700)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(700)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(700)
            )
        },
        popExitTransition = {
            slideOutOfContainer(towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(700)
            )
        }
    )
    {
        composable(route = "home") { HomeScreen(navController) }
        composable(route = "add") { AddScreen(navController) }
    }
}
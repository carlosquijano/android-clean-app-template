package com.github.carlosquijano.androidjetpacktemplate.app.ui.features.navigation

/**
 * Graph class for handling main navigation routes in the application.
 *
 * @property ROOT The root route of the application.
 * @property AUTHENTICATION The authentication route.
 * @property MAIN The main route.
 * @property HOME The home route.
 * @property ABOUT The about route.
 * @property NOTIFICATIONS The route for notifications.
 * @property SETTINGS The route for settings.
 * @property PROFILE The route for the profile.
 */
class NavRoutes {
    companion object {
        const val ROOT = "ROOT"
        const val AUTHENTICATION = "AUTHENTICATION"
        const val WELCOME = "WELCOME"
        const val MAIN = "MAIN"
        const val SCAFFOLD = "SCAFFOLD"
        const val HOME = "HOME"
        const val HOMEPAGE = "HOMEPAGE"
        const val LOGIN = "LOGIN"
        const val SIGNUP = "SIGNUP"
        const val FORGOT_PASSWORD = "FORGOT_PASSWORD"
        const val ABOUT = "ABOUT"
        const val NOTIFICATIONS = "NOTIFICATIONS"
        const val INBOX = "INBOX"
        const val SETTINGS = "SETTINGS"
        const val PROFILE = "PROFILE"
    }
}

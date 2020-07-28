package com.developer.allef.boilerplateapp.ui

/**
 * @author allef.santos on 27/07/20
 */
interface MainContract {
    interface MainView {
        fun showLoading()
        fun showMovies(movies: List<String>)
        fun showError(message: String)
    }
}
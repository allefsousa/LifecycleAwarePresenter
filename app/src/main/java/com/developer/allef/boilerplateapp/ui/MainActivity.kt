package com.developer.allef.boilerplateapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.developer.allef.boilerplateapp.R

class MainActivity : AppCompatActivity(),MainContract.MainView {

    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter = MainPresenter()
        mainPresenter.attachView(this,lifecycle)
        mainPresenter.loadMovies()
    }

    override fun showLoading() {

    }

    override fun showMovies(movies: List<String>) {

    }

    override fun showError(message: String) {

    }
}

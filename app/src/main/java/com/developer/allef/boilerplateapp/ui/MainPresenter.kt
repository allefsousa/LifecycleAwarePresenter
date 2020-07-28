package com.developer.allef.boilerplateapp.ui

import android.util.Log
import android.view.View
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent

/**
 * @author allef.santos on 27/07/20
 */
class MainPresenter : BasePresenter<MainContract.MainView>() {

//    private val disposable = CompositeDisposable()

    fun loadMovies(){
        Log.d(MainPresenter::class.java.simpleName,"Load Movies")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.d(MainPresenter::class.java.simpleName,"OnResume")

    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.d(MainPresenter::class.java.simpleName,"OnStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.d(MainPresenter::class.java.simpleName,"OnPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.d(MainPresenter::class.java.simpleName,"OnStop")
    }


    override fun onCleared() {
        super.onCleared()
//        disposable.dispose
    }
}
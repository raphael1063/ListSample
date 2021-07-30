package com.example.listsample.ui.main

import com.example.listsample.base.BaseViewModel
import com.example.listsample.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository): BaseViewModel() {

 init {
     getUserInfo()
     getUserRepo()
 }

    private fun getUserInfo() {
        repository.getInfo("JakeWharton")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({

            }, {

            }).addTo(compositeDisposable)
    }

    private fun getUserRepo() {
        repository.getInfo("JakeWharton")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({

            }, {

            }).addTo(compositeDisposable)
    }
}
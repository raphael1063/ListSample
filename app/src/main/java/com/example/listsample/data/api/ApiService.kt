package com.example.listsample.data.api

import com.example.listsample.data.entities.UserInfoItem
import com.example.listsample.data.entities.UserRepoItem
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/users/{username}")
    fun getInfo(@Path("username") userName: String) : Single<UserInfoItem>

    @GET("/users/{username}/repos")
    fun getRepo(@Path("username") userName: String) : Single<UserRepoItem>
}
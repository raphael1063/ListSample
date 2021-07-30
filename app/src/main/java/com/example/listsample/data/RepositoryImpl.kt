package com.example.listsample.data

import com.example.listsample.data.api.ApiService
import com.example.listsample.data.entities.UserInfoItem
import com.example.listsample.data.entities.UserRepoItem
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(private val apiService: ApiService) : Repository {

    override fun getInfo(userName: String): Single<UserInfoItem> =
        apiService.getInfo(userName)

    override fun getRepo(userName: String): Single<UserRepoItem> =
        apiService.getRepo(userName)
}
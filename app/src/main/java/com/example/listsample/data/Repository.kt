package com.example.listsample.data

import com.example.listsample.data.entities.UserInfoItem
import com.example.listsample.data.entities.UserRepoItem
import io.reactivex.Single

interface Repository {

    fun getInfo(userName: String) : Single<UserInfoItem>

    fun getRepo(userName: String) : Single<UserRepoItem>
}
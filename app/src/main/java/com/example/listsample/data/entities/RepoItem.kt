package com.example.listsample.data.entities

data class RepoItem(
    val repoName: String,
    val isStar: Boolean,
    val count: Int,
    val repoDescription: String
) {
    constructor() : this("", false, 0, "")
}
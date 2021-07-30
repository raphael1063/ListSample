package com.example.listsample.data.entities

data class ListModel(
    val owner: OwnerItem,
    val repoList: List<RepoItem>
) {

}

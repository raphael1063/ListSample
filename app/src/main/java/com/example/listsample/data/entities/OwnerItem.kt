package com.example.listsample.data.entities

data class OwnerItem(
    val avatarUrl: String,
    val ownerName: String
) {
    constructor() : this("", "")
}

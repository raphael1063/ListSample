package com.example.listsample.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.listsample.R
import com.example.listsample.base.HEADER
import com.example.listsample.data.entities.ListModel
import com.example.listsample.data.entities.OwnerItem
import com.example.listsample.data.entities.RepoItem
import com.example.listsample.databinding.ItemHeaderBinding
import com.example.listsample.databinding.ItemListBinding

class MainListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var ownerItem = OwnerItem()
    private var repoItem = listOf<RepoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            HEADER -> {
                HeaderViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_header, parent, false))
            }
            else -> {
                HeaderViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_list, parent, false))
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is HeaderViewHolder -> holder.bind(ownerItem)
            is ItemViewHolder -> holder.bind(repoItem[position])
        }
    }

    override fun getItemCount() = repoItem.size + 1

    fun setModel(listModel: ListModel) {
        ownerItem = listModel.owner
        repoItem = listModel.repoList
    }

    class HeaderViewHolder(private val binding: ItemHeaderBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(ownerItem: OwnerItem) {
            binding.model = ownerItem
        }
    }

    class ItemViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(listItem: RepoItem) {
            binding.model = listItem
        }
    }

}
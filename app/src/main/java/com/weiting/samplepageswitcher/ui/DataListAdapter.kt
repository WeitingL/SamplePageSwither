package com.weiting.samplepageswitcher.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.weiting.samplepageswitcher.Util
import com.weiting.samplepageswitcher.databinding.ItemRowBinding
import java.util.*

class DataListAdapter : ListAdapter<Date, DataListAdapter.DateViewHolder>(DiffCallback) {
    object DiffCallback : DiffUtil.ItemCallback<Date>() {
        override fun areItemsTheSame(oldItem: Date, newItem: Date): Boolean = oldItem === newItem

        override fun areContentsTheSame(oldItem: Date, newItem: Date): Boolean = oldItem == newItem

    }

    inner class DateViewHolder(private val binding: ItemRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(date: Date, position: Int) {
            binding.apply {
                rowText.text = "項目$position"
                rowDate.text = "${Util().getDateToString(date)}"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DateViewHolder {
        return DateViewHolder(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DateViewHolder, position: Int) {
        return holder.bind(getItem(position), position + 1)
    }

}
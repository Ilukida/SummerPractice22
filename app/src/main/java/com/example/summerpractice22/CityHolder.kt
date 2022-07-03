package com.example.summerpractice22

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.summerpractice22.databinding.ItemCityBinding

class CityHolder (
        private val binding: ItemCityBinding,
        private val glide: RequestManager,
        private val onItemClick: (City) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(city: City) {
                with(binding) {
                        tvName.text = city.name
                        tvYear.text = city.year.toString()
                        root.setOnClickListener {
                                onItemClick(city)
                        }
                        glide
                                .load(city.url)
                                .placeholder(R.drawable.mountain)
                                .error(R.drawable.mountain)
                                .into(ivCover)
                }
        }
}
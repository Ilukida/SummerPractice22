package com.example.summerpractice22

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.summerpractice22.databinding.ItemCityBinding

class CityAdapter(
    private var list: List<City>,
    private val glide: RequestManager,
    private val onItemClick: (City) -> Unit,
) : RecyclerView.Adapter<CityHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CityHolder = CityHolder(
        binding = ItemCityBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onItemClick = onItemClick
    )

    override fun onBindViewHolder(
        holder: CityHolder,
        position: Int
    ) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
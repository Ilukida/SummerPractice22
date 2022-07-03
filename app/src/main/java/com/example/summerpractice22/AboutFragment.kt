package com.example.summerpractice22

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.google.android.material.transition.MaterialContainerTransform
import com.bumptech.glide.Glide
import com.example.summerpractice22.databinding.FragmentAboutBinding

class AboutFragment : Fragment(R.layout.fragment_about) {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)

        val cities = (requireActivity() as MainActivity).cities
        val position = arguments?.getInt("id", -1)

        if (position == null || position == -1) {
            Log.d("Cities", "Error")
            return binding.root
        }

        Glide.with(requireContext())
            .load(cities[position].url)
            .into(binding.aboutImage)
        binding.aboutName.text = cities[position].name
        binding.aboutDescription.text = cities[position].description
        binding.aboutYear.text = cities[position].year.toString()

        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceType")
    override fun setSharedElementEnterTransition(transition: Any?) {
        MaterialContainerTransform().apply {
            drawingViewId = R.id.main_nav_host_fragment
            duration = 1000
            scrimColor = Color.BLUE
            setAllContainerColors(requireContext().getColor(com.google.android.material.R.attr.colorSurface))
        }
    }
}
package com.example.summerpractice22

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.summerpractice22.databinding.FragmentCountryBinding
import com.google.android.material.snackbar.Snackbar

class CountryFragment : Fragment(R.layout.fragment_country) {
    private var _binding: FragmentCountryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCountryBinding.inflate(inflater, container, false)

        val cities = (requireActivity() as MainActivity).cities

        binding.rvCities.adapter = CityAdapter(cities, Glide.with(this)){
            val bundle = Bundle()
            bundle.putInt(
                "id" , it.id
            )
            findNavController().navigate(
                R.id.action_countryFragment_to_aboutFragment, bundle
            )
        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}
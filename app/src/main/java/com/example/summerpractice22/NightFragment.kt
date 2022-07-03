package com.example.summerpractice22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice22.databinding.FragmentNightBinding

class NightFragment : Fragment(R.layout.fragment_night) {

    private var _binding: FragmentNightBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentNightBinding.bind(view)

        with(binding) {
            btnTimeNight.setOnClickListener {
                val bundle = Bundle()
                val text = "NightFragment"
                bundle.putString(
                    "ARG_TEXT",
                    text
                )
                findNavController().navigate(
                    R.id.action_nightFragment_to_timeFragment,
                    bundle,
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
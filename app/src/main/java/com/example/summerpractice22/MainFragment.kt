package com.example.summerpractice22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice22.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        with(binding) {
            btnTime.setOnClickListener {
                val bundle = Bundle()
                val text = "MorningFragment"
                bundle.putString(
                    "ARG_TEXT",
                    text
                )
                findNavController().navigate(
                    R.id.action_mainFragment_to_timeFragment,
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
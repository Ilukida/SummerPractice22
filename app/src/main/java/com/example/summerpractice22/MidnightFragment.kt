package com.example.summerpractice22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice22.databinding.FragmentMidnightBinding

class MidnightFragment : Fragment(R.layout.fragment_midnight) {

    private var _binding: FragmentMidnightBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentMidnightBinding.bind(view)

        with(binding) {
            btnTimeMidnight.setOnClickListener {
                val bundle = Bundle()
                val text = "MidnightFragment"
                bundle.putString(
                    "ARG_TEXT",
                    text
                )
                findNavController().navigate(
                    R.id.action_midnightFragment_to_timeFragment,
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
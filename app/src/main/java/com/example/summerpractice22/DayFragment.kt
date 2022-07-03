package com.example.summerpractice22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice22.databinding.FragmentDayBinding

class DayFragment : Fragment(R.layout.fragment_day) {

    private var _binding: FragmentDayBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentDayBinding.bind(view)

        with(binding) {
            btnTimeDay.setOnClickListener {
                val bundle = Bundle()
                val text = "DayFragment"
                bundle.putString(
                    "ARG_TEXT",
                    text
                )
                findNavController().navigate(
                    R.id.action_dayFragment_to_timeFragment,
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
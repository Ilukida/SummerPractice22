package com.example.summerpractice22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.summerpractice22.R
import android.content.Context
import com.example.summerpractice22.databinding.FragmentMorningBinding
import androidx.navigation.fragment.findNavController

class MorningFragment : Fragment(R.layout.fragment_morning) {

    private var _binding: FragmentMorningBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMorningBinding.bind(view)

//        with(binding) {
//            findNavController().navigate(
//                    R.id.action_morningFragment_to_dayFragment,
//                    DayFragment.createBundle(text),
//                )
//        }
    }

//    override fun onDestroyView() {
//        _binding = null
//        super.onDestroyView()
//    }
}
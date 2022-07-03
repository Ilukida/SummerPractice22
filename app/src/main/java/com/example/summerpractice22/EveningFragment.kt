package com.example.summerpractice22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice22.databinding.FragmentEveningBinding

class EveningFragment : Fragment(R.layout.fragment_evening) {

    private var _binding: FragmentEveningBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentEveningBinding.bind(view)

        with(binding) {
            btnTimeEvening.setOnClickListener {
                val bundle = Bundle()
                val text = "EveningFragment"
                bundle.putString(
                    "ARG_TEXT",
                    text
                )
                findNavController().navigate(
                    R.id.action_eveningFragment_to_timeFragment,
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
package com.company.datatransfer

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

class SecondFragment : Fragment(R.layout.fragment_second) {
    val mainViewModel by activityViewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(requireContext(), mainViewModel.data, Toast.LENGTH_SHORT).show()

        button.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }
}
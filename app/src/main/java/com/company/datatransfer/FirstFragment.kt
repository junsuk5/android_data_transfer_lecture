package com.company.datatransfer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first) {
    val mainViewModel by activityViewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            mainViewModel.data = "Hello"
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}

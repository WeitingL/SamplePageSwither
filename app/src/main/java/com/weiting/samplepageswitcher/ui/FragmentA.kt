package com.weiting.samplepageswitcher.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.weiting.samplepageswitcher.databinding.FragmentABinding

class FragmentA: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentABinding.inflate(inflater)
        val viewModel = ViewModelProvider(this).get(AViewModel::class.java)


        return binding.root
    }

}
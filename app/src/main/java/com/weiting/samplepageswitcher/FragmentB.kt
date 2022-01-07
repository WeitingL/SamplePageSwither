package com.weiting.samplepageswitcher

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.weiting.samplepageswitcher.databinding.FragmentBBinding

class FragmentB: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBBinding.inflate(inflater)


        return binding.root
    }

}
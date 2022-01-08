package com.weiting.samplepageswitcher

import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.weiting.samplepageswitcher.ui.FragmentA
import com.weiting.samplepageswitcher.ui.FragmentB

class PageAdapter(activity: MainActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> getFragmentA()
            1 -> getFragmentB()
            else -> throw Exception("Unknown position $position")
        }
    }

    private fun getFragmentA():FragmentA{
        return FragmentA()
    }

    private fun getFragmentB():FragmentB{
        return FragmentB()
    }

}
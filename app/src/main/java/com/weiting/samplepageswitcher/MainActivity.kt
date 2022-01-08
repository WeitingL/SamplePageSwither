package com.weiting.samplepageswitcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.weiting.samplepageswitcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabLayout = binding.tlTabs
        val viewPage = binding.vpViewPage

        viewPage.adapter = PageAdapter(this, binding.tvTitle)
        viewPage.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.apply {
                    when (position) {
                        0 -> {
                            tvTitle.text = "線上測驗A"
                            btSwitch.text = "切至分頁2"
                        }
                        1 -> {
                            tvTitle.text = "線上測驗B"
                            btSwitch.text = "切至分頁1"
                        }
                    }
                }
            }
        })

        binding.btSwitch.setOnClickListener {
            when (viewPage.getCurrentItem()) {
                0 -> viewPage.setCurrentItem(1)
                1 -> viewPage.setCurrentItem(0)
                else -> viewPage.setCurrentItem(0)
            }
        }

        TabLayoutMediator(tabLayout, viewPage) { tab, position ->
            when (position) {
                0 -> tab.text = "分頁1"
                1 -> tab.text = "分頁2"
            }
        }.attach()

    }

}
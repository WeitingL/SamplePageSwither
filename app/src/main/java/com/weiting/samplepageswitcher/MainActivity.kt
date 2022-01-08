package com.weiting.samplepageswitcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.tabs.TabLayoutMediator
import com.weiting.samplepageswitcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabLayout = binding.tlTabs
        val viewPage = binding.vpViewPage

        viewPage.adapter = PageAdapter(this)

        binding.btSwitch.setOnClickListener {
            when(viewPage.getCurrentItem()){
                0 -> {
                    viewPage.setCurrentItem(1)
                }
                1 -> {
                    viewPage.setCurrentItem(0)
                }
                else -> {
                    viewPage.setCurrentItem(0)
                }
            }
        }

        TabLayoutMediator(tabLayout, viewPage){ tab, position ->
            when (position){
                0 -> {
                    tab.text = "分頁1"
                }
                1 -> {
                    tab.text = "分頁2"
                }
            }
        }.attach()

    }

}
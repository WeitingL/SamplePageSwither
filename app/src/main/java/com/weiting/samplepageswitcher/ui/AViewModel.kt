package com.weiting.samplepageswitcher.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class AViewModel : ViewModel() {

    private val _dataList = MutableLiveData<List<Date>>()
    val dataList: LiveData<List<Date>>
        get() = _dataList

    init {
        _dataList.value = getDataList()
    }

    private fun getDataList(): List<Date> {
        val list = mutableListOf<Date>()
        val calender = Calendar.getInstance()

        for (i in 0..19){
            calender.add(Calendar.DATE, i)
            list.add(calender.time)
        }

        return list
    }

}
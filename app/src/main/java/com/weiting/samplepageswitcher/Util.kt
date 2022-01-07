package com.weiting.samplepageswitcher

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class Util {

    fun getDateToString(time: Date): String{
        val date = SimpleDateFormat("MM/dd", Locale.TAIWAN)
        val week = SimpleDateFormat("EEEE", Locale.TAIWAN)
        return "${date.format(time)} (${week.format(time)})"
    }

}
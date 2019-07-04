package org.firehound.solarmonitor.utils

import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.formatter.IAxisValueFormatter
import java.text.SimpleDateFormat
import java.util.*

class TimeFormatter : IAxisValueFormatter {
    override fun getFormattedValue(value: Float, axis: AxisBase?): String {
        val date = Date((value*10000*1000).toLong())
        val jsf = SimpleDateFormat("HH:mm", Locale.ENGLISH)
        jsf.timeZone = TimeZone.getTimeZone("GMT")
        return jsf.format(date)
    }
}
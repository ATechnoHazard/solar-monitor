package org.firehound.solarmonitor.fragments


import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.android.synthetic.main.fragment_graph.*
import org.firehound.solarmonitor.R
import org.firehound.solarmonitor.utils.TimeFormatter

class GraphFragment : Fragment() {


    private var currentEntries = ArrayList<Entry>()
    private var voltageEntries = ArrayList<Entry>()
    private var powerEntries = ArrayList<Entry>()
    private var freqEntries = ArrayList<Entry>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_graph, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addEntries()

        val currDataSet = LineDataSet(currentEntries, "PV1 Current (A)")
        currDataSet.color = Color.GREEN
        currentLineChart.data = LineData(currDataSet)
        currentLineChart.xAxis.valueFormatter = TimeFormatter()
        currentLineChart.invalidate()

        val voltDataSet = LineDataSet(voltageEntries, "PV1 Voltage (V)")
        voltDataSet.color = Color.RED
        voltageLineChart.data = LineData(voltDataSet)
        voltageLineChart.xAxis.valueFormatter = TimeFormatter()
        voltageLineChart.invalidate()

        val powDataSet = LineDataSet(powerEntries, "Power (W)")
        powDataSet.color = Color.YELLOW
        powerLineChart.data = LineData(powDataSet)
        powerLineChart.xAxis.valueFormatter = TimeFormatter()
        powerLineChart.invalidate()

        val freqDataSet = LineDataSet(freqEntries, "PV1 Voltage (V)")
        freqDataSet.color = Color.BLACK
        freqLineChart.data = LineData(freqDataSet)
        freqLineChart.xAxis.valueFormatter = TimeFormatter()
        freqLineChart.invalidate()
    }

    private fun addEntries() {
        currentEntries.clear()
        currentEntries.add(Entry(155539.494F, 0F))
        currentEntries.add(Entry(155539.524F, 0F))
        currentEntries.add(Entry(155539.554F, 0F))
        currentEntries.add(Entry(155539.584F, 0F))
        currentEntries.add(Entry(155539.614F, 0F))
        currentEntries.add(Entry(155539.644F, 0F))
        currentEntries.add(Entry(155539.674F, 0.1F))
        currentEntries.add(Entry(155539.704F, 0.1F))
        currentEntries.add(Entry(155539.734F, 0.1F))
        currentEntries.add(Entry(155539.764F, 0.2F))
        currentEntries.add(Entry(155539.794F, 0.2F))
        currentEntries.add(Entry(155539.824F, 0.3F))
        currentEntries.add(Entry(155539.854F, 0.4F))
        currentEntries.add(Entry(155539.884F, 0.4F))
        currentEntries.add(Entry(155539.914F, 0.4F))
        currentEntries.add(Entry(155539.944F, 0.4F))
        currentEntries.add(Entry(155539.974F, 0.5F))
        currentEntries.add(Entry(155540.004F, 0.6F))
        currentEntries.add(Entry(155540.034F, 0.7F))
        currentEntries.add(Entry(155540.064F, 0.8F))
        currentEntries.add(Entry(155540.094F, 0.8F))
        currentEntries.add(Entry(155540.124F, 1F))
        currentEntries.add(Entry(155540.154F, 1.1F))
        currentEntries.add(Entry(155540.184F, 1.2F))
        currentEntries.add(Entry(155540.214F, 1.3F))
        currentEntries.add(Entry(155540.244F, 1.4F))
        currentEntries.add(Entry(155540.274F, 1.5F))
        currentEntries.add(Entry(155540.304F, 1.7F))
        currentEntries.add(Entry(155540.334F, 1.8F))
        currentEntries.add(Entry(155540.364F, 1.9F))
        currentEntries.add(Entry(155540.394F, 2F))
        currentEntries.add(Entry(155540.424F, 2.1F))
        currentEntries.add(Entry(155540.454F, 2.1F))
        currentEntries.add(Entry(155540.484F, 2.2F))
        currentEntries.add(Entry(155540.514F, 2.4F))
        currentEntries.add(Entry(155540.544F, 2.4F))
        currentEntries.add(Entry(155540.574F, 2.6F))
        currentEntries.add(Entry(155540.604F, 2.7F))
        currentEntries.add(Entry(155540.634F, 2.9F))
        currentEntries.add(Entry(155540.664F, 3F))
        currentEntries.add(Entry(155540.694F, 3.1F))
        currentEntries.add(Entry(155540.724F, 3.2F))
        currentEntries.add(Entry(155540.754F, 3.3F))
        currentEntries.add(Entry(155540.784F, 3.4F))
        currentEntries.add(Entry(155540.814F, 3.6F))
        currentEntries.add(Entry(155540.844F, 3.8F))
        currentEntries.add(Entry(155540.874F, 3.9F))
        currentEntries.add(Entry(155540.904F, 0F))
        currentEntries.add(Entry(155540.934F, 4F))
        currentEntries.add(Entry(155540.964F, 4.3F))
        currentEntries.add(Entry(155540.994F, 4.3F))
        currentEntries.add(Entry(155541.024F, 4.4F))
        currentEntries.add(Entry(155541.054F, 4.4F))
        currentEntries.add(Entry(155541.084F, 4.5F))
        currentEntries.add(Entry(155541.114F, 4.7F))
        currentEntries.add(Entry(155541.144F, 4.8F))
        currentEntries.add(Entry(155541.174F, 4.8F))
        currentEntries.add(Entry(155541.204F, 4.5F))
        currentEntries.add(Entry(155541.234F, 4.7F))
        currentEntries.add(Entry(155541.264F, 4.9F))
        currentEntries.add(Entry(155541.294F, 4.7F))
        currentEntries.add(Entry(155541.324F, 4.9F))
        currentEntries.add(Entry(155541.354F, 5F))
        currentEntries.add(Entry(155541.384F, 5.2F))
        currentEntries.add(Entry(155541.414F, 5.1F))
        currentEntries.add(Entry(155541.444F, 4.9F))
        currentEntries.add(Entry(155541.474F, 5.3F))
        currentEntries.add(Entry(155541.504F, 5.3F))
        currentEntries.add(Entry(155541.534F, 5.1F))
        currentEntries.add(Entry(155541.564F, 3.4F))
        currentEntries.add(Entry(155541.594F, 5.1F))
        currentEntries.add(Entry(155541.624F, 5F))
        currentEntries.add(Entry(155541.654F, 5.1F))
        currentEntries.add(Entry(155541.684F, 5.2F))
        currentEntries.add(Entry(155541.714F, 5F))
        currentEntries.add(Entry(155541.744F, 5.1F))
        currentEntries.add(Entry(155541.774F, 5.1F))
        currentEntries.add(Entry(155541.804F, 4F))
        currentEntries.add(Entry(155541.834F, 2.7F))
        currentEntries.add(Entry(155541.864F, 4.8F))
        currentEntries.add(Entry(155541.894F, 4.6F))
        currentEntries.add(Entry(155541.924F, 5.3F))
        currentEntries.add(Entry(155541.954F, 5.2F))
        currentEntries.add(Entry(155541.984F, 5.2F))
        currentEntries.add(Entry(155542.014F, 4.6F))
        currentEntries.add(Entry(155542.044F, 5.2F))
        currentEntries.add(Entry(155542.074F, 4.9F))
        currentEntries.add(Entry(155542.104F, 5F))
        currentEntries.add(Entry(155542.134F, 2.5F))
        currentEntries.add(Entry(155542.164F, 2.7F))
        currentEntries.add(Entry(155542.194F, 3.6F))
        currentEntries.add(Entry(155542.224F, 2.5F))
        currentEntries.add(Entry(155542.254F, 2.9F))
        currentEntries.add(Entry(155542.284F, 4.3F))
        currentEntries.add(Entry(155542.314F, 3.1F))
        currentEntries.add(Entry(155542.344F, 4.5F))
        currentEntries.add(Entry(155542.374F, 3F))
        currentEntries.add(Entry(155542.404F, 4.8F))
        currentEntries.add(Entry(155542.434F, 4.5F))
        currentEntries.add(Entry(155542.464F, 4.2F))
        currentEntries.add(Entry(155542.494F, 4.4F))
        currentEntries.add(Entry(155542.524F, 3F))
        currentEntries.add(Entry(155542.554F, 2.2F))
        currentEntries.add(Entry(155542.584F, 3.3F))
        currentEntries.add(Entry(155542.614F, 3F))
        currentEntries.add(Entry(155542.644F, 3.2F))
        currentEntries.add(Entry(155542.674F, 2.7F))
        currentEntries.add(Entry(155542.704F, 2.2F))
        currentEntries.add(Entry(155542.734F, 1.8F))
        currentEntries.add(Entry(155542.764F, 1.9F))
        currentEntries.add(Entry(155542.794F, 2.5F))
        currentEntries.add(Entry(155542.824F, 2.4F))
        currentEntries.add(Entry(155542.854F, 3.3F))
        currentEntries.add(Entry(155542.884F, 3.3F))
        currentEntries.add(Entry(155542.914F, 2.6F))
        currentEntries.add(Entry(155542.944F, 2.9F))
        currentEntries.add(Entry(155542.974F, 2.7F))
        currentEntries.add(Entry(155543.004F, 2.5F))
        currentEntries.add(Entry(155543.034F, 2.5F))
        currentEntries.add(Entry(155543.064F, 2.3F))
        currentEntries.add(Entry(155543.094F, 1.7F))
        currentEntries.add(Entry(155543.124F, 1.3F))
        currentEntries.add(Entry(155543.154F, 1.6F))
        currentEntries.add(Entry(155543.184F, 0.6F))
        currentEntries.add(Entry(155543.214F, 0.6F))
        currentEntries.add(Entry(155543.244F, 0.6F))
        currentEntries.add(Entry(155543.274F, 0.7F))
        currentEntries.add(Entry(155543.304F, 0.8F))
        currentEntries.add(Entry(155543.334F, 0.8F))
        currentEntries.add(Entry(155543.364F, 0.5F))
        currentEntries.add(Entry(155543.394F, 1F))
        currentEntries.add(Entry(155543.424F, 1.1F))
        currentEntries.add(Entry(155543.454F, 0.6F))
        currentEntries.add(Entry(155543.484F, 0.4F))
        currentEntries.add(Entry(155543.514F, 0.7F))
        currentEntries.add(Entry(155543.544F, 0.3F))
        currentEntries.add(Entry(155543.574F, 0.4F))
        currentEntries.add(Entry(155543.604F, 0.3F))
        currentEntries.add(Entry(155543.634F, 0.3F))
        currentEntries.add(Entry(155543.664F, 0.2F))
        currentEntries.add(Entry(155543.694F, 0.2F))
        currentEntries.add(Entry(155543.724F, 0.3F))
        currentEntries.add(Entry(155543.754F, 0.2F))
        currentEntries.add(Entry(155543.784F, 0.2F))
        currentEntries.add(Entry(155543.814F, 0.2F))
        currentEntries.add(Entry(155543.844F, 0.1F))
        currentEntries.add(Entry(155543.874F, 0.1F))
        currentEntries.add(Entry(155543.904F, 0.1F))
        currentEntries.add(Entry(155543.934F, 0.1F))
        currentEntries.add(Entry(155543.964F, 0.1F))
        currentEntries.add(Entry(155543.994F, 0F))
        currentEntries.add(Entry(155544.024F, 0F))
        currentEntries.add(Entry(155544.054F, 0F))
        currentEntries.add(Entry(155544.084F, 0F))
        currentEntries.add(Entry(155544.114F, 0F))
        currentEntries.add(Entry(155544.144F, 0F))
        currentEntries.add(Entry(155544.174F, 0F))
        currentEntries.add(Entry(155544.204F, 0F))

        voltageEntries.clear()
        voltageEntries.add(Entry(155539.494F, 75.9F))
        voltageEntries.add(Entry(155539.524F, 82.5F))
        voltageEntries.add(Entry(155539.554F, 87.3F))
        voltageEntries.add(Entry(155539.584F, 77.9F))
        voltageEntries.add(Entry(155539.614F, 325.1F))
        voltageEntries.add(Entry(155539.644F, 233.1F))
        voltageEntries.add(Entry(155539.674F, 273.6F))
        voltageEntries.add(Entry(155539.704F, 241.4F))
        voltageEntries.add(Entry(155539.734F, 257.1F))
        voltageEntries.add(Entry(155539.764F, 286.5F))
        voltageEntries.add(Entry(155539.794F, 323.2F))
        voltageEntries.add(Entry(155539.824F, 308.5F))
        voltageEntries.add(Entry(155539.854F, 278.9F))
        voltageEntries.add(Entry(155539.884F, 275.1F))
        voltageEntries.add(Entry(155539.914F, 315.4F))
        voltageEntries.add(Entry(155539.944F, 322.4F))
        voltageEntries.add(Entry(155539.974F, 308.8F))
        voltageEntries.add(Entry(155540.004F, 319.6F))
        voltageEntries.add(Entry(155540.034F, 325F))
        voltageEntries.add(Entry(155540.064F, 334.6F))
        voltageEntries.add(Entry(155540.094F, 337.2F))
        voltageEntries.add(Entry(155540.124F, 334.3F))
        voltageEntries.add(Entry(155540.154F, 328.3F))
        voltageEntries.add(Entry(155540.184F, 329F))
        voltageEntries.add(Entry(155540.214F, 334.2F))
        voltageEntries.add(Entry(155540.244F, 339.3F))
        voltageEntries.add(Entry(155540.274F, 339.8F))
        voltageEntries.add(Entry(155540.304F, 337.2F))
        voltageEntries.add(Entry(155540.334F, 338.6F))
        voltageEntries.add(Entry(155540.364F, 338.7F))
        voltageEntries.add(Entry(155540.394F, 340.9F))
        voltageEntries.add(Entry(155540.424F, 339.5F))
        voltageEntries.add(Entry(155540.454F, 339.8F))
        voltageEntries.add(Entry(155540.484F, 336.9F))
        voltageEntries.add(Entry(155540.514F, 337.9F))
        voltageEntries.add(Entry(155540.544F, 335.6F))
        voltageEntries.add(Entry(155540.574F, 339.1F))
        voltageEntries.add(Entry(155540.604F, 339F))
        voltageEntries.add(Entry(155540.634F, 333.5F))
        voltageEntries.add(Entry(155540.664F, 328.8F))
        voltageEntries.add(Entry(155540.694F, 330.5F))
        voltageEntries.add(Entry(155540.724F, 331.7F))
        voltageEntries.add(Entry(155540.754F, 334.2F))
        voltageEntries.add(Entry(155540.784F, 332.1F))
        voltageEntries.add(Entry(155540.814F, 330.7F))
        voltageEntries.add(Entry(155540.844F, 333.3F))
        voltageEntries.add(Entry(155540.874F, 331.6F))
        voltageEntries.add(Entry(155540.904F, 403.5F))
        voltageEntries.add(Entry(155540.934F, 331.7F))
        voltageEntries.add(Entry(155540.964F, 325F))
        voltageEntries.add(Entry(155540.994F, 325.5F))
        voltageEntries.add(Entry(155541.024F, 323.6F))
        voltageEntries.add(Entry(155541.054F, 324.2F))
        voltageEntries.add(Entry(155541.084F, 324.9F))
        voltageEntries.add(Entry(155541.114F, 324.4F))
        voltageEntries.add(Entry(155541.144F, 319.1F))
        voltageEntries.add(Entry(155541.174F, 320.6F))
        voltageEntries.add(Entry(155541.204F, 322.1F))
        voltageEntries.add(Entry(155541.234F, 323.7F))
        voltageEntries.add(Entry(155541.264F, 312.2F))
        voltageEntries.add(Entry(155541.294F, 323F))
        voltageEntries.add(Entry(155541.324F, 322.1F))
        voltageEntries.add(Entry(155541.354F, 316.7F))
        voltageEntries.add(Entry(155541.384F, 319.2F))
        voltageEntries.add(Entry(155541.414F, 319.9F))
        voltageEntries.add(Entry(155541.444F, 319.1F))
        voltageEntries.add(Entry(155541.474F, 319.8F))
        voltageEntries.add(Entry(155541.504F, 317.6F))
        voltageEntries.add(Entry(155541.534F, 318.9F))
        voltageEntries.add(Entry(155541.564F, 338.8F))
        voltageEntries.add(Entry(155541.594F, 322.4F))
        voltageEntries.add(Entry(155541.624F, 322.4F))
        voltageEntries.add(Entry(155541.654F, 319.4F))
        voltageEntries.add(Entry(155541.684F, 318.8F))
        voltageEntries.add(Entry(155541.714F, 318.6F))
        voltageEntries.add(Entry(155541.744F, 319.9F))
        voltageEntries.add(Entry(155541.774F, 325.7F))
        voltageEntries.add(Entry(155541.804F, 317.9F))
        voltageEntries.add(Entry(155541.834F, 320.5F))
        voltageEntries.add(Entry(155541.864F, 321.9F))
        voltageEntries.add(Entry(155541.894F, 310.6F))
        voltageEntries.add(Entry(155541.924F, 316.7F))
        voltageEntries.add(Entry(155541.954F, 323.3F))
        voltageEntries.add(Entry(155541.984F, 318.7F))
        voltageEntries.add(Entry(155542.014F, 331.1F))
        voltageEntries.add(Entry(155542.044F, 325.3F))
        voltageEntries.add(Entry(155542.074F, 317.5F))
        voltageEntries.add(Entry(155542.104F, 314.3F))
        voltageEntries.add(Entry(155542.134F, 292.3F))
        voltageEntries.add(Entry(155542.164F, 319F))
        voltageEntries.add(Entry(155542.194F, 324F))
        voltageEntries.add(Entry(155542.224F, 323.5F))
        voltageEntries.add(Entry(155542.254F, 305.9F))
        voltageEntries.add(Entry(155542.284F, 326.4F))
        voltageEntries.add(Entry(155542.314F, 329.7F))
        voltageEntries.add(Entry(155542.344F, 313.2F))
        voltageEntries.add(Entry(155542.374F, 325.5F))
        voltageEntries.add(Entry(155542.404F, 319.9F))
        voltageEntries.add(Entry(155542.434F, 322.1F))
        voltageEntries.add(Entry(155542.464F, 318.9F))
        voltageEntries.add(Entry(155542.494F, 325.9F))
        voltageEntries.add(Entry(155542.524F, 340.1F))
        voltageEntries.add(Entry(155542.554F, 324.3F))
        voltageEntries.add(Entry(155542.584F, 323.2F))
        voltageEntries.add(Entry(155542.614F, 326.3F))
        voltageEntries.add(Entry(155542.644F, 318.1F))
        voltageEntries.add(Entry(155542.674F, 331.1F))
        voltageEntries.add(Entry(155542.704F, 316.9F))
        voltageEntries.add(Entry(155542.734F, 336.2F))
        voltageEntries.add(Entry(155542.764F, 316.6F))
        voltageEntries.add(Entry(155542.794F, 325.7F))
        voltageEntries.add(Entry(155542.824F, 310.7F))
        voltageEntries.add(Entry(155542.854F, 329.3F))
        voltageEntries.add(Entry(155542.884F, 324.9F))
        voltageEntries.add(Entry(155542.914F, 327.6F))
        voltageEntries.add(Entry(155542.944F, 321.6F))
        voltageEntries.add(Entry(155542.974F, 326.5F))
        voltageEntries.add(Entry(155543.004F, 333.6F))
        voltageEntries.add(Entry(155543.034F, 328.1F))
        voltageEntries.add(Entry(155543.064F, 330.4F))
        voltageEntries.add(Entry(155543.094F, 326.7F))
        voltageEntries.add(Entry(155543.124F, 321F))
        voltageEntries.add(Entry(155543.154F, 324.7F))
        voltageEntries.add(Entry(155543.184F, 323.6F))
        voltageEntries.add(Entry(155543.214F, 312.2F))
        voltageEntries.add(Entry(155543.244F, 320.2F))
        voltageEntries.add(Entry(155543.274F, 312F))
        voltageEntries.add(Entry(155543.304F, 314.8F))
        voltageEntries.add(Entry(155543.334F, 327.2F))
        voltageEntries.add(Entry(155543.364F, 317.5F))
        voltageEntries.add(Entry(155543.394F, 336.3F))
        voltageEntries.add(Entry(155543.424F, 336F))
        voltageEntries.add(Entry(155543.454F, 318F))
        voltageEntries.add(Entry(155543.484F, 318.9F))
        voltageEntries.add(Entry(155543.514F, 327F))
        voltageEntries.add(Entry(155543.544F, 300.8F))
        voltageEntries.add(Entry(155543.574F, 311.8F))
        voltageEntries.add(Entry(155543.604F, 287.5F))
        voltageEntries.add(Entry(155543.634F, 305.5F))
        voltageEntries.add(Entry(155543.664F, 302.9F))
        voltageEntries.add(Entry(155543.694F, 308.7F))
        voltageEntries.add(Entry(155543.724F, 289.6F))
        voltageEntries.add(Entry(155543.754F, 308.1F))
        voltageEntries.add(Entry(155543.784F, 287.2F))
        voltageEntries.add(Entry(155543.814F, 285F))
        voltageEntries.add(Entry(155543.844F, 290.4F))
        voltageEntries.add(Entry(155543.874F, 267F))
        voltageEntries.add(Entry(155543.904F, 249.2F))
        voltageEntries.add(Entry(155543.934F, 218.8F))
        voltageEntries.add(Entry(155543.964F, 249.6F))
        voltageEntries.add(Entry(155543.994F, 270.9F))
        voltageEntries.add(Entry(155544.024F, 167.4F))
        voltageEntries.add(Entry(155544.054F, 201.2F))
        voltageEntries.add(Entry(155544.084F, 152.1F))
        voltageEntries.add(Entry(155544.114F, 125F))
        voltageEntries.add(Entry(155544.144F, 124.9F))
        voltageEntries.add(Entry(155544.174F, 126F))
        voltageEntries.add(Entry(155544.204F, 75.6F))

        powerEntries.clear()
        powerEntries.add(Entry(155539.524F, 0F))
        powerEntries.add(Entry(155539.554F, 0F))
        powerEntries.add(Entry(155539.584F, 0F))
        powerEntries.add(Entry(155539.614F, 0F))
        powerEntries.add(Entry(155539.644F, 19F))
        powerEntries.add(Entry(155539.674F, 26F))
        powerEntries.add(Entry(155539.704F, 29F))
        powerEntries.add(Entry(155539.734F, 36F))
        powerEntries.add(Entry(155539.764F, 52F))
        powerEntries.add(Entry(155539.794F, 75F))
        powerEntries.add(Entry(155539.824F, 92F))
        powerEntries.add(Entry(155539.854F, 105F))
        powerEntries.add(Entry(155539.884F, 106F))
        powerEntries.add(Entry(155539.914F, 129F))
        powerEntries.add(Entry(155539.944F, 134F))
        powerEntries.add(Entry(155539.974F, 159F))
        powerEntries.add(Entry(155540.004F, 214F))
        powerEntries.add(Entry(155540.034F, 240F))
        powerEntries.add(Entry(155540.064F, 268F))
        powerEntries.add(Entry(155540.094F, 295F))
        powerEntries.add(Entry(155540.124F, 336F))
        powerEntries.add(Entry(155540.154F, 359F))
        powerEntries.add(Entry(155540.184F, 398F))
        powerEntries.add(Entry(155540.214F, 440F))
        powerEntries.add(Entry(155540.244F, 479F))
        powerEntries.add(Entry(155540.274F, 526F))
        powerEntries.add(Entry(155540.304F, 561F))
        powerEntries.add(Entry(155540.334F, 598F))
        powerEntries.add(Entry(155540.364F, 639F))
        powerEntries.add(Entry(155540.394F, 675F))
        powerEntries.add(Entry(155540.424F, 695F))
        powerEntries.add(Entry(155540.454F, 703F))
        powerEntries.add(Entry(155540.484F, 737F))
        powerEntries.add(Entry(155540.514F, 787F))
        powerEntries.add(Entry(155540.544F, 807F))
        powerEntries.add(Entry(155540.574F, 866F))
        powerEntries.add(Entry(155540.604F, 903F))
        powerEntries.add(Entry(155540.634F, 959F))
        powerEntries.add(Entry(155540.664F, 972F))
        powerEntries.add(Entry(155540.694F, 986F))
        powerEntries.add(Entry(155540.724F, 1021F))
        powerEntries.add(Entry(155540.754F, 1065F))
        powerEntries.add(Entry(155540.784F, 1100F))
        powerEntries.add(Entry(155540.814F, 1173F))
        powerEntries.add(Entry(155540.844F, 1225F))
        powerEntries.add(Entry(155540.874F, 1250F))
        powerEntries.add(Entry(155540.904F, 0F))
        powerEntries.add(Entry(155540.934F, 1294F))
        powerEntries.add(Entry(155540.964F, 1351F))
        powerEntries.add(Entry(155540.994F, 1360F))
        powerEntries.add(Entry(155541.024F, 1387F))
        powerEntries.add(Entry(155541.054F, 1399F))
        powerEntries.add(Entry(155541.084F, 1429F))
        powerEntries.add(Entry(155541.114F, 1483F))
        powerEntries.add(Entry(155541.144F, 1494F))
        powerEntries.add(Entry(155541.174F, 1490F))
        powerEntries.add(Entry(155541.204F, 1408F))
        powerEntries.add(Entry(155541.234F, 1470F))
        powerEntries.add(Entry(155541.264F, 1481F))
        powerEntries.add(Entry(155541.294F, 1474F))
        powerEntries.add(Entry(155541.324F, 1528F))
        powerEntries.add(Entry(155541.354F, 1533F))
        powerEntries.add(Entry(155541.384F, 1593F))
        powerEntries.add(Entry(155541.414F, 1584F))
        powerEntries.add(Entry(155541.444F, 1501F))
        powerEntries.add(Entry(155541.474F, 1647F))
        powerEntries.add(Entry(155541.504F, 1627F))
        powerEntries.add(Entry(155541.534F, 1578F))
        powerEntries.add(Entry(155541.564F, 1107F))
        powerEntries.add(Entry(155541.594F, 1585F))
        powerEntries.add(Entry(155541.624F, 1559F))
        powerEntries.add(Entry(155541.654F, 1566F))
        powerEntries.add(Entry(155541.684F, 1599F))
        powerEntries.add(Entry(155541.714F, 1560F))
        powerEntries.add(Entry(155541.744F, 1586F))
        powerEntries.add(Entry(155541.774F, 1596F))
        powerEntries.add(Entry(155541.804F, 1247F))
        powerEntries.add(Entry(155541.834F, 869F))
        powerEntries.add(Entry(155541.864F, 1515F))
        powerEntries.add(Entry(155541.894F, 1403F))
        powerEntries.add(Entry(155541.924F, 1619F))
        powerEntries.add(Entry(155541.954F, 1645F))
        powerEntries.add(Entry(155541.984F, 1601F))
        powerEntries.add(Entry(155542.014F, 1497F))
        powerEntries.add(Entry(155542.044F, 1632F))
        powerEntries.add(Entry(155542.074F, 1501F))
        powerEntries.add(Entry(155542.104F, 1525F))
        powerEntries.add(Entry(155542.134F, 723F))
        powerEntries.add(Entry(155542.164F, 856F))
        powerEntries.add(Entry(155542.194F, 1095F))
        powerEntries.add(Entry(155542.224F, 785F))
        powerEntries.add(Entry(155542.254F, 873F))
        powerEntries.add(Entry(155542.284F, 1373F))
        powerEntries.add(Entry(155542.314F, 993F))
        powerEntries.add(Entry(155542.344F, 1347F))
        powerEntries.add(Entry(155542.374F, 956F))
        powerEntries.add(Entry(155542.404F, 1494F))
        powerEntries.add(Entry(155542.434F, 1417F))
        powerEntries.add(Entry(155542.464F, 1310F))
        powerEntries.add(Entry(155542.494F, 1400F))
        powerEntries.add(Entry(155542.524F, 999F))
        powerEntries.add(Entry(155542.554F, 698F))
        powerEntries.add(Entry(155542.584F, 1048F))
        powerEntries.add(Entry(155542.614F, 965F))
        powerEntries.add(Entry(155542.644F, 989F))
        powerEntries.add(Entry(155542.674F, 872F))
        powerEntries.add(Entry(155542.704F, 678F))
        powerEntries.add(Entry(155542.734F, 603F))
        powerEntries.add(Entry(155542.764F, 595F))
        powerEntries.add(Entry(155542.794F, 805F))
        powerEntries.add(Entry(155542.824F, 742F))
        powerEntries.add(Entry(155542.854F, 1074F))
        powerEntries.add(Entry(155542.884F, 1045F))
        powerEntries.add(Entry(155542.914F, 853F))
        powerEntries.add(Entry(155542.944F, 914F))
        powerEntries.add(Entry(155542.974F, 862F))
        powerEntries.add(Entry(155543.004F, 838F))
        powerEntries.add(Entry(155543.034F, 808F))
        powerEntries.add(Entry(155543.064F, 760F))
        powerEntries.add(Entry(155543.094F, 569F))
        powerEntries.add(Entry(155543.124F, 431F))
        powerEntries.add(Entry(155543.154F, 524F))
        powerEntries.add(Entry(155543.184F, 222F))
        powerEntries.add(Entry(155543.214F, 194F))
        powerEntries.add(Entry(155543.244F, 218F))
        powerEntries.add(Entry(155543.274F, 240F))
        powerEntries.add(Entry(155543.304F, 251F))
        powerEntries.add(Entry(155543.334F, 272F))
        powerEntries.add(Entry(155543.364F, 178F))
        powerEntries.add(Entry(155543.394F, 333F))
        powerEntries.add(Entry(155543.424F, 370F))
        powerEntries.add(Entry(155543.454F, 197F))
        powerEntries.add(Entry(155543.484F, 132F))
        powerEntries.add(Entry(155543.514F, 230F))
        powerEntries.add(Entry(155543.544F, 115F))
        powerEntries.add(Entry(155543.574F, 146F))
        powerEntries.add(Entry(155543.604F, 108F))
        powerEntries.add(Entry(155543.634F, 91F))
        powerEntries.add(Entry(155543.664F, 75F))
        powerEntries.add(Entry(155543.694F, 81F))
        powerEntries.add(Entry(155543.724F, 104F))
        powerEntries.add(Entry(155543.754F, 88F))
        powerEntries.add(Entry(155543.784F, 56F))
        powerEntries.add(Entry(155543.814F, 59F))
        powerEntries.add(Entry(155543.844F, 48F))
        powerEntries.add(Entry(155543.874F, 35F))
        powerEntries.add(Entry(155543.904F, 28F))
        powerEntries.add(Entry(155543.934F, 29F))
        powerEntries.add(Entry(155543.964F, 35F))
        powerEntries.add(Entry(155543.994F, 22F))
        powerEntries.add(Entry(155544.024F, 12F))
        powerEntries.add(Entry(155544.054F, 11F))
        powerEntries.add(Entry(155544.084F, 9F))
        powerEntries.add(Entry(155544.114F, 7F))
        powerEntries.add(Entry(155544.144F, 7F))
        powerEntries.add(Entry(155544.174F, 6F))
        powerEntries.add(Entry(155544.204F, 0F))

        freqEntries.clear()
        freqEntries.add(Entry(155539.494F, 49.97F))
        freqEntries.add(Entry(155539.524F, 50.01F))
        freqEntries.add(Entry(155539.554F, 49.97F))
        freqEntries.add(Entry(155539.584F, 50.01F))
        freqEntries.add(Entry(155539.614F, 49.98F))
        freqEntries.add(Entry(155539.644F, 50.01F))
        freqEntries.add(Entry(155539.674F, 50.06F))
        freqEntries.add(Entry(155539.704F, 50.02F))
        freqEntries.add(Entry(155539.734F, 50.04F))
        freqEntries.add(Entry(155539.764F, 50.06F))
        freqEntries.add(Entry(155539.794F, 50.02F))
        freqEntries.add(Entry(155539.824F, 50.02F))
        freqEntries.add(Entry(155539.854F, 50.02F))
        freqEntries.add(Entry(155539.884F, 50.02F))
        freqEntries.add(Entry(155539.914F, 49.96F))
        freqEntries.add(Entry(155539.944F, 49.92F))
        freqEntries.add(Entry(155539.974F, 49.91F))
        freqEntries.add(Entry(155540.004F, 49.82F))
        freqEntries.add(Entry(155540.034F, 49.8F))
        freqEntries.add(Entry(155540.064F, 49.87F))
        freqEntries.add(Entry(155540.094F, 49.9F))
        freqEntries.add(Entry(155540.124F, 49.85F))
        freqEntries.add(Entry(155540.154F, 49.91F))
        freqEntries.add(Entry(155540.184F, 49.91F))
        freqEntries.add(Entry(155540.214F, 49.92F))
        freqEntries.add(Entry(155540.244F, 49.91F))
        freqEntries.add(Entry(155540.274F, 49.99F))
        freqEntries.add(Entry(155540.304F, 49.97F))
        freqEntries.add(Entry(155540.334F, 50.02F))
        freqEntries.add(Entry(155540.364F, 50.03F))
        freqEntries.add(Entry(155540.394F, 50F))
        freqEntries.add(Entry(155540.424F, 50F))
        freqEntries.add(Entry(155540.454F, 50.01F))
        freqEntries.add(Entry(155540.484F, 50F))
        freqEntries.add(Entry(155540.514F, 50F))
        freqEntries.add(Entry(155540.544F, 49.97F))
        freqEntries.add(Entry(155540.574F, 49.94F))
        freqEntries.add(Entry(155540.604F, 49.99F))
        freqEntries.add(Entry(155540.634F, 49.92F))
        freqEntries.add(Entry(155540.664F, 49.88F))
        freqEntries.add(Entry(155540.694F, 49.94F))
        freqEntries.add(Entry(155540.724F, 49.91F))
        freqEntries.add(Entry(155540.754F, 49.97F))
        freqEntries.add(Entry(155540.784F, 50.03F))
        freqEntries.add(Entry(155540.814F, 49.92F))
        freqEntries.add(Entry(155540.844F, 49.86F))
        freqEntries.add(Entry(155540.874F, 50F))
        freqEntries.add(Entry(155540.904F, 50.09F))
        freqEntries.add(Entry(155540.934F, 50.09F))
        freqEntries.add(Entry(155540.964F, 50.11F))
        freqEntries.add(Entry(155540.994F, 50F))
        freqEntries.add(Entry(155541.024F, 50.02F))
        freqEntries.add(Entry(155541.054F, 49.96F))
        freqEntries.add(Entry(155541.084F, 50.05F))
        freqEntries.add(Entry(155541.114F, 50.06F))
        freqEntries.add(Entry(155541.144F, 50.04F))
        freqEntries.add(Entry(155541.174F, 50.11F))
        freqEntries.add(Entry(155541.204F, 50.12F))
        freqEntries.add(Entry(155541.234F, 50.16F))
        freqEntries.add(Entry(155541.264F, 50.1F))
        freqEntries.add(Entry(155541.294F, 50.02F))
        freqEntries.add(Entry(155541.324F, 50F))
        freqEntries.add(Entry(155541.354F, 50.06F))
        freqEntries.add(Entry(155541.384F, 50.02F))
        freqEntries.add(Entry(155541.414F, 49.97F))
        freqEntries.add(Entry(155541.444F, 49.97F))
        freqEntries.add(Entry(155541.474F, 49.91F))
        freqEntries.add(Entry(155541.504F, 49.92F))
        freqEntries.add(Entry(155541.534F, 49.93F))
        freqEntries.add(Entry(155541.564F, 49.8F))
        freqEntries.add(Entry(155541.594F, 49.81F))
        freqEntries.add(Entry(155541.624F, 49.89F))
        freqEntries.add(Entry(155541.654F, 49.88F))
        freqEntries.add(Entry(155541.684F, 49.82F))
        freqEntries.add(Entry(155541.714F, 49.78F))
        freqEntries.add(Entry(155541.744F, 49.86F))
        freqEntries.add(Entry(155541.774F, 50F))
        freqEntries.add(Entry(155541.804F, 49.97F))
        freqEntries.add(Entry(155541.834F, 49.82F))
        freqEntries.add(Entry(155541.864F, 49.82F))
        freqEntries.add(Entry(155541.894F, 49.81F))
        freqEntries.add(Entry(155541.924F, 49.88F))
        freqEntries.add(Entry(155541.954F, 50.1F))
        freqEntries.add(Entry(155541.984F, 50.11F))
        freqEntries.add(Entry(155542.014F, 49.96F))
        freqEntries.add(Entry(155542.044F, 49.87F))
        freqEntries.add(Entry(155542.074F, 49.98F))
        freqEntries.add(Entry(155542.104F, 49.95F))
        freqEntries.add(Entry(155542.134F, 50.03F))
        freqEntries.add(Entry(155542.164F, 50F))
        freqEntries.add(Entry(155542.194F, 49.91F))
        freqEntries.add(Entry(155542.224F, 49.9F))
        freqEntries.add(Entry(155542.254F, 49.92F))
        freqEntries.add(Entry(155542.284F, 49.93F))
        freqEntries.add(Entry(155542.314F, 49.92F))
        freqEntries.add(Entry(155542.344F, 50.04F))
        freqEntries.add(Entry(155542.374F, 49.89F))
        freqEntries.add(Entry(155542.404F, 49.84F))
        freqEntries.add(Entry(155542.434F, 49.99F))
        freqEntries.add(Entry(155542.464F, 49.93F))
        freqEntries.add(Entry(155542.494F, 49.92F))
        freqEntries.add(Entry(155542.524F, 50.03F))
        freqEntries.add(Entry(155542.554F, 49.95F))
        freqEntries.add(Entry(155542.584F, 49.89F))
        freqEntries.add(Entry(155542.614F, 49.96F))
        freqEntries.add(Entry(155542.644F, 49.95F))
        freqEntries.add(Entry(155542.674F, 50.05F))
        freqEntries.add(Entry(155542.704F, 50F))
        freqEntries.add(Entry(155542.734F, 50.1F))
        freqEntries.add(Entry(155542.764F, 49.96F))
        freqEntries.add(Entry(155542.794F, 50.1F))
        freqEntries.add(Entry(155542.824F, 50.05F))
        freqEntries.add(Entry(155542.854F, 50.08F))
        freqEntries.add(Entry(155542.884F, 50.08F))
        freqEntries.add(Entry(155542.914F, 50.06F))
        freqEntries.add(Entry(155542.944F, 50.1F))
        freqEntries.add(Entry(155542.974F, 50.02F))
        freqEntries.add(Entry(155543.004F, 50.01F))
        freqEntries.add(Entry(155543.034F, 50.06F))
        freqEntries.add(Entry(155543.064F, 50.07F))
        freqEntries.add(Entry(155543.094F, 50.11F))
        freqEntries.add(Entry(155543.124F, 50.05F))
        freqEntries.add(Entry(155543.154F, 50.04F))
        freqEntries.add(Entry(155543.184F, 50.06F))
        freqEntries.add(Entry(155543.214F, 49.98F))
        freqEntries.add(Entry(155543.244F, 50.03F))
        freqEntries.add(Entry(155543.274F, 49.96F))
        freqEntries.add(Entry(155543.304F, 49.95F))
        freqEntries.add(Entry(155543.334F, 49.94F))
        freqEntries.add(Entry(155543.364F, 49.91F))
        freqEntries.add(Entry(155543.394F, 50.02F))
        freqEntries.add(Entry(155543.424F, 50.11F))
        freqEntries.add(Entry(155543.454F, 50F))
        freqEntries.add(Entry(155543.484F, 49.99F))
        freqEntries.add(Entry(155543.514F, 50.01F))
        freqEntries.add(Entry(155543.544F, 50.03F))
        freqEntries.add(Entry(155543.574F, 50.07F))
        freqEntries.add(Entry(155543.604F, 50.05F))
        freqEntries.add(Entry(155543.634F, 49.97F))
        freqEntries.add(Entry(155543.664F, 50.04F))
        freqEntries.add(Entry(155543.694F, 50.03F))
        freqEntries.add(Entry(155543.724F, 49.91F))
        freqEntries.add(Entry(155543.754F, 50.03F))
        freqEntries.add(Entry(155543.784F, 50.01F))
        freqEntries.add(Entry(155543.814F, 49.99F))
        freqEntries.add(Entry(155543.844F, 49.97F))
        freqEntries.add(Entry(155543.874F, 49.91F))
        freqEntries.add(Entry(155543.904F, 49.99F))
        freqEntries.add(Entry(155543.934F, 49.94F))
        freqEntries.add(Entry(155543.964F, 49.96F))
        freqEntries.add(Entry(155543.994F, 49.95F))
        freqEntries.add(Entry(155544.024F, 49.92F))
        freqEntries.add(Entry(155544.054F, 49.92F))
        freqEntries.add(Entry(155544.084F, 49.95F))
        freqEntries.add(Entry(155544.114F, 50F))
        freqEntries.add(Entry(155544.144F, 50.08F))
        freqEntries.add(Entry(155544.174F, 50.01F))
        freqEntries.add(Entry(155544.204F, 49.97F))
    }
}

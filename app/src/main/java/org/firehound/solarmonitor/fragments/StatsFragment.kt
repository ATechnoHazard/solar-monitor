package org.firehound.solarmonitor.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_stats.*
import org.firehound.solarmonitor.R
import org.firehound.solarmonitor.adapters.InfoRecyclerViewAdapter

class StatsFragment : Fragment() {
    var statsTitles = ArrayList<String>()
    var statsSubs = ArrayList<String>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stats, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addItems()
        statsRecyclerView.adapter = InfoRecyclerViewAdapter(statsTitles, statsSubs)
        statsRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun addItems() {
        statsTitles.clear()
        statsSubs.clear()
        statsTitles.add("Yield Today")
        statsSubs.add("7.5kWh")
        statsTitles.add("Monthly Yield")
        statsSubs.add("45.8kWh")
        statsTitles.add("Yearly Yield")
        statsSubs.add("2533.8kWh")
        statsTitles.add("Total Yield")
        statsSubs.add("6879.73kWh")
    }
}

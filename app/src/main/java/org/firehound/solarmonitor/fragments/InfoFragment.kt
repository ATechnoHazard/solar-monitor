package org.firehound.solarmonitor.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_info.*
import org.firehound.solarmonitor.R
import org.firehound.solarmonitor.adapters.InfoRecyclerViewAdapter

private val titles = ArrayList<String>()
private val subtitles = ArrayList<String>()


class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addValues()
        infoRecyclerView.adapter = InfoRecyclerViewAdapter(titles, subtitles)
        infoRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun addValues() {
        titles.clear()
        subtitles.clear()

        titles.add("System size")
        subtitles.add("3 KW")

        titles.add("Commission Date")
        subtitles.add("2017-12-28")

        titles.add("Trees planted")
        subtitles.add("18.48 trees")

        titles.add("Carbon offset")
        subtitles.add("6.85 tons")

        titles.add("Income")
        subtitles.add("INR68453.26")

        titles.add("Rated power")
        subtitles.add("3 KW")
    }
}

package org.firehound.solarmonitor.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.main_recyclerview_item.view.*
import org.firehound.solarmonitor.R

class InfoRecyclerViewAdapter (private val title : ArrayList<String>, private val subtitle : ArrayList<String>) :
    RecyclerView.Adapter<InfoRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.main_recyclerview_item, parent, false))

    override fun getItemCount() = title.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titleText.text = title[position]
        holder.subtitleText.text = subtitle[position]
    }


    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val titleText = view.siteNameText!!
        val subtitleText = view.siteDescriptionText!!
    }
}
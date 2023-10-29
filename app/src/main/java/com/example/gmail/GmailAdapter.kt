package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GmailAdapter(val inboxes: ArrayList<GmailModel>): BaseAdapter() {
    override fun getCount(): Int {
        return inboxes.size
    }

    override fun getItem(position: Int): Any {
        return inboxes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView: View
        itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.mail, parent, false)
        itemView.findViewById<TextView>(R.id.name).text = inboxes[position].name
        itemView.findViewById<TextView>(R.id.content).text = inboxes[position].content
        itemView.findViewById<ImageView>(R.id.avatar).setImageResource(inboxes[position].avatar)

        return itemView
    }

}
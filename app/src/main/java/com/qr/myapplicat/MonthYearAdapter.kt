package com.qr.myapplicat

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MonthYearAdapter(context: Context, private val months: List<String>, private val years: List<String>) :
    BaseAdapter() {

    private val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return months.size
    }

    override fun getItem(position: Int): Any {
        return months[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null) {
            view = inflater.inflate(R.layout.month_year_item, parent, false)
        }

        val monthTextView = view!!.findViewById<TextView>(R.id.month_text)
        val yearTextView = view!!.findViewById<TextView>(R.id.year_text)

        monthTextView.text = months[position]
        yearTextView.text = years[position]

        return view
    }
}

package com.qr.myapplicat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val months = listOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
        val years = mutableListOf<String>()
        for (year in 2023..2033) {
            years.add(year.toString())
        }
        val listView = findViewById<ListView>(R.id.month_year_list)
        val adapter = MonthYearAdapter(this, months, years)
        listView.adapter = adapter
        listView.setOnItemClickListener { _, view, position, _ ->
            val selectedMonth = months[position]
            val selectedYear = years[position]

            Toast.makeText(this, "${selectedMonth}${selectedYear}", Toast.LENGTH_SHORT).show()
        }

    }
}
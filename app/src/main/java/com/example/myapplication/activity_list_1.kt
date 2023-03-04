package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

var array = arrayOf("Nmax","Aerox","Mio i 125","PCX","ADB","Click 150","Beat","Raider 15", "Sniper 150")
class activity_list_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list1)

        val adapter = ArrayAdapter(this,
            R.layout.activity_my_list, array)

        val listView: ListView = findViewById(R.id.listview)
        listView.setAdapter(adapter)

        listView.onItemClickListener = object : AdapterView.OnItemClickListener {

            override fun onItemClick(parent: AdapterView<*>, view: View,
                                     position: Int, id: Long) {

                // value of item that is clicked
                val itemValue = listView.getItemAtPosition(position) as String

                // Toast the values
                Toast.makeText(applicationContext,
                    "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}
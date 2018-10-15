package com.pedromassango.materialcomponents

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.navigation_header.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting header view
        val headerView = navigation_view.getHeaderView(0)
        // binding header component data (textView)
        headerView.tv_header_title.text = "Text updated via Code"

        // listen for clicks
        navigation_view.setNavigationItemSelectedListener { menuItem ->

            // handle drawer item click

            when(menuItem.itemId == R.id.action_all_photos){
                // show all photos fragment
            }
            return@setNavigationItemSelectedListener true
        }

        
    }
}

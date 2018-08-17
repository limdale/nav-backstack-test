package com.dtlim.navbackstacktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavOptions
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Toolbar>(R.id.toolbar).let {
            title = getString(R.string.app_name)
            setSupportActionBar(it)
            it.setNavigationOnClickListener {
                Navigation.findNavController(this, R.id.nav_host_fragment).navigateUp()
            }
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<Button>(R.id.button_go_to_1).setOnClickListener {
            Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.fragment1,
                    null,
                    NavOptions.Builder()
                            .build())
        }

        findViewById<Button>(R.id.button_go_to_2).setOnClickListener {
            Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.fragment2,
                    null,
                    NavOptions.Builder()
                            .build())
        }

        findViewById<Button>(R.id.button_go_to_3).setOnClickListener {
            Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.fragment3,
                    null,
                    NavOptions.Builder()
                            .build())
        }
    }
}

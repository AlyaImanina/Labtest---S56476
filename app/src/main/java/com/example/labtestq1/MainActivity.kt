package com.example.labtestq1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnWeb = findViewById<Button>(R.id.btnWeb)
        btnWeb.setOnClickListener {
            val website = findViewById<EditText>(R.id.inWeb)
            var strURL = website.text.toString()
            if (strURL.indexOf("http://www") < 0) {
                strURL = "http://www.$strURL"
            }
            val implicit = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(strURL)
            )
            startActivity(implicit)
        }


        val btnPhone = findViewById<Button>(R.id.btnPhone)
        btnPhone.setOnClickListener {
            val inPhone = findViewById<View>(R.id.inPhone)
            val implicit = Intent(
                Intent.ACTION_CALL,
               // Uri.parse("tel:" + inPhone.toString())
            )
            startActivity(implicit)
        }
    }
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        return true
//
//    }

}

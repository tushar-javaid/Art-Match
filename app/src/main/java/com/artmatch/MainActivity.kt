package com.artmatch

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Navigate to Recommendations
        findViewById<Button>(R.id.btn_recommendations).setOnClickListener {
            startActivity(Intent(this, RecommendationsActivity::class.java))
        }

        // Navigate to Catalog
        findViewById<Button>(R.id.btn_catalog).setOnClickListener {
            startActivity(Intent(this, CatalogActivity::class.java))
        }

        // Navigate to Account
        findViewById<Button>(R.id.btn_account).setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
        }
    }
}

package com.example.fooddash.activities

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddash.R

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        // Bottom nav
        setupBottomNav()
    }

    private fun setupBottomNav() {
        findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        findViewById<LinearLayout>(R.id.navRestaurant).setOnClickListener {
            startActivity(Intent(this, RestaurantActivity::class.java))
        }
        // navCart is already active — no action needed
        findViewById<LinearLayout>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
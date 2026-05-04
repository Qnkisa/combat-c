package com.example.fooddash.activities

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddash.R

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

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
        findViewById<LinearLayout>(R.id.navCart).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
        // navProfile is already active — no action needed
    }
}
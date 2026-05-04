package com.example.fooddash.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddash.R

class FoodDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        // Back button
        val btnBack = findViewById<TextView>(R.id.btnBack)
        btnBack.setOnClickListener { finish() }

        // Add to cart button → Cart
        val addToCartBtn = findViewById<Button>(R.id.btnAddToCart)
        addToCartBtn.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }

        // Bottom nav
        setupBottomNav()
    }

    private fun setupBottomNav() {
        findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        // navRestaurant is active (food details is under menu)
        findViewById<LinearLayout>(R.id.navRestaurant).setOnClickListener {
            startActivity(Intent(this, RestaurantActivity::class.java))
        }
        findViewById<LinearLayout>(R.id.navCart).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
        findViewById<LinearLayout>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
package com.example.fooddash.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddash.R

class FoodDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        // Read product data from Intent extras
        val name        = intent.getStringExtra("FOOD_NAME")        ?: "Unknown Item"
        val price       = intent.getStringExtra("FOOD_PRICE")       ?: ""
        val description = intent.getStringExtra("FOOD_DESCRIPTION") ?: ""
        val rating      = intent.getStringExtra("FOOD_RATING")      ?: "⭐ 4.5 · 20-30 min delivery"
        val imageRes    = intent.getIntExtra("FOOD_IMAGE_RES", R.drawable.burger)

        // Populate views
        findViewById<ImageView>(R.id.foodImage).setImageResource(imageRes)
        findViewById<TextView>(R.id.foodName).text = name
        findViewById<TextView>(R.id.foodPrice).text = price
        findViewById<TextView>(R.id.foodDesc).text = description
        findViewById<TextView>(R.id.foodRating).text = rating

        // Back button — go back to the previous screen
        findViewById<TextView>(R.id.btnBack).setOnClickListener { finish() }

        // Add to cart button → Cart
        findViewById<Button>(R.id.btnAddToCart).setOnClickListener {
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
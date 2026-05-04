package com.example.fooddash.activities

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddash.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Category cards → Restaurant
        val burger = findViewById<LinearLayout>(R.id.cardBurger)
        val pizza = findViewById<LinearLayout>(R.id.cardPizza)
        val drinks = findViewById<LinearLayout>(R.id.cardDrinks)
        val desserts = findViewById<LinearLayout>(R.id.cardDesserts)

        burger.setOnClickListener { startActivity(Intent(this, RestaurantActivity::class.java)) }
        pizza.setOnClickListener { startActivity(Intent(this, RestaurantActivity::class.java)) }
        drinks.setOnClickListener { startActivity(Intent(this, RestaurantActivity::class.java)) }
        desserts.setOnClickListener { startActivity(Intent(this, RestaurantActivity::class.java)) }

        // Bottom nav
        setupBottomNav()
    }

    private fun setupBottomNav() {
        // Home is already active — no action needed for navHome
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
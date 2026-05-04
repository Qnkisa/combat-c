package com.example.fooddash.activities

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddash.R

class RestaurantActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        // Menu item cards → Food Details
        val pizzaCard = findViewById<LinearLayout>(R.id.cardPizza)
        val burgerCard = findViewById<LinearLayout>(R.id.cardBurger)
        val drinksCard = findViewById<LinearLayout>(R.id.cardDrinks)
        val dessertsCard = findViewById<LinearLayout>(R.id.cardDesserts)

        pizzaCard.setOnClickListener { startActivity(Intent(this, FoodDetailsActivity::class.java)) }
        burgerCard.setOnClickListener { startActivity(Intent(this, FoodDetailsActivity::class.java)) }
        drinksCard.setOnClickListener { startActivity(Intent(this, FoodDetailsActivity::class.java)) }
        dessertsCard.setOnClickListener { startActivity(Intent(this, FoodDetailsActivity::class.java)) }

        // Bottom nav
        setupBottomNav()
    }

    private fun setupBottomNav() {
        findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        // navRestaurant is already active — no action needed
        findViewById<LinearLayout>(R.id.navCart).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
        findViewById<LinearLayout>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
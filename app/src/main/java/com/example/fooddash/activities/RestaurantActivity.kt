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

        val pizzaCard = findViewById<LinearLayout>(R.id.cardPizza)
        val burgerCard = findViewById<LinearLayout>(R.id.cardBurger)

        val intent = Intent(this, FoodDetailsActivity::class.java)

        pizzaCard.setOnClickListener { startActivity(intent) }
        burgerCard.setOnClickListener { startActivity(intent) }
    }
}
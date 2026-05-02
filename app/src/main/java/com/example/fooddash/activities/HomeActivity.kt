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

        val burger = findViewById<LinearLayout>(R.id.cardBurger)
        val pizza = findViewById<LinearLayout>(R.id.cardPizza)
        val drinks = findViewById<LinearLayout>(R.id.cardDrinks)
        val desserts = findViewById<LinearLayout>(R.id.cardDesserts)

        val intent = Intent(this, RestaurantActivity::class.java)

        burger.setOnClickListener { startActivity(intent) }
        pizza.setOnClickListener { startActivity(intent) }
        drinks.setOnClickListener { startActivity(intent) }
        desserts.setOnClickListener { startActivity(intent) }
    }
}
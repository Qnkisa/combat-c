package com.example.fooddash.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddash.R

class FoodDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        val addToCartBtn = findViewById<Button>(R.id.btnAddToCart)

        addToCartBtn.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
    }
}
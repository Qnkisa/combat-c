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

        // Menu item cards → Food Details (with product data)
        findViewById<LinearLayout>(R.id.cardPizza).setOnClickListener {
            openDetails(
                name = "Pepperoni Pizza",
                price = "€12.99",
                description = "A classic Neapolitan-style pizza loaded with rich tomato sauce, generous layers of fresh mozzarella and spicy pepperoni slices, baked to a golden crisp in a stone oven.",
                rating = "⭐ 4.7 · 25-35 min delivery",
                imageRes = R.drawable.pizza
            )
        }

        findViewById<LinearLayout>(R.id.cardBurger).setOnClickListener {
            openDetails(
                name = "Beef Burger",
                price = "€9.99",
                description = "A juicy grilled beef patty topped with crisp lettuce, ripe tomato, melted cheese and our signature smoky sauce — all in a toasted brioche bun.",
                rating = "⭐ 4.8 · 20-30 min delivery",
                imageRes = R.drawable.burger
            )
        }

        findViewById<LinearLayout>(R.id.cardDrinks).setOnClickListener {
            openDetails(
                name = "Refreshing Drinks",
                price = "€3.49",
                description = "Choose from a wide selection of ice-cold soft drinks, freshly squeezed juices and thick milkshakes — the perfect companion to any meal.",
                rating = "⭐ 4.5 · 15-20 min delivery",
                imageRes = R.drawable.drink
            )
        }

        findViewById<LinearLayout>(R.id.cardDesserts).setOnClickListener {
            openDetails(
                name = "Sweet Desserts",
                price = "€5.99",
                description = "Indulge in our handcrafted desserts — from velvety chocolate lava cakes and creamy cheesecakes to scoops of premium artisan ice cream.",
                rating = "⭐ 4.6 · 20-25 min delivery",
                imageRes = R.drawable.dessert
            )
        }

        setupBottomNav()
    }

    private fun openDetails(name: String, price: String, description: String, rating: String, imageRes: Int) {
        val intent = Intent(this, FoodDetailsActivity::class.java).apply {
            putExtra("FOOD_NAME", name)
            putExtra("FOOD_PRICE", price)
            putExtra("FOOD_DESCRIPTION", description)
            putExtra("FOOD_RATING", rating)
            putExtra("FOOD_IMAGE_RES", imageRes)
        }
        startActivity(intent)
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
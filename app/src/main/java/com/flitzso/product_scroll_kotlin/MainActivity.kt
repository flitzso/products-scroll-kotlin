package com.flitzso.product_scroll_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flitzso.product_scroll_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Aqui e a logica do click
        binding.buyButton.setOnClickListener {

            val navegarBuyArea = Intent(this,buy_area::class.java)
            startActivity(navegarBuyArea)
        }

        // Aqui e a logica do click
        binding.cartButton.setOnClickListener {

            val navegarCartShopArea = Intent(this,cart_shop_area::class.java)
            startActivity(navegarCartShopArea)
        }
    }
}
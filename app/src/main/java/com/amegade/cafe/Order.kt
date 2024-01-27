package com.amegade.cafe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Order : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tVorder = findViewById<Button>(R.id.tVorder )
        setContentView(R.layout.activity_order)
        val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)
        tVorder.text = orderOfCustomer.toString()
    }
}
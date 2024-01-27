package com.amegade.cafe

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amegade.cafe.ui.theme.CafeTheme


class MainActivity : ComponentActivity() {

    companion object{
        const val KEY="com.amegade.cafe.MainActivity.KEY"
    }
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        val buttonOrder = findViewById<Button>(R.id.btnOrder)
        val ORDER1 = findViewById<Button>(R.id.ORDER1)
        val ORDER2 = findViewById<Button>(R.id.ORDER2)
        val ORDER3 = findViewById<Button>(R.id.ORDER3)
        val ORDER4 = findViewById<Button>(R.id.ORDER4)
        buttonOrder.setOnClickListener {
            val orderList = ORDER1.text.toString()+ " " +  ORDER2.text.toString()+ " " +
                    ORDER3.text.toString()+ " " +  ORDER4.text

            intent = Intent(this, Order::class.java)
            intent.putExtra(KEY,orderList)
            startActivity(intent)
        }


    }

}




package id.haadii.binar.chapter2.day8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import id.haadii.binar.chapter2.R
import id.haadii.binar.chapter2.day6.Day6Activity
import id.haadii.binar.chapter2.day7.Day7Activity

class Day8Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day8)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        openActivityOne()
        openActivityTwo()
    }

    private fun openActivityOne() {
        val buttonOne = findViewById<Button>(R.id.btn_page_one)
        buttonOne.setOnClickListener {
            val intent = Intent(this, Day7Activity::class.java)
            startActivity(intent)
        }
    }

    private fun openActivityTwo() {
        val buttonTwo = findViewById<Button>(R.id.btn_page_two)
        buttonTwo.setOnClickListener {
            val intent = Intent(this, Day6Activity::class.java)
            startActivity(intent)
        }
    }
}
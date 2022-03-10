package id.haadii.binar.chapter2.day9

import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import id.haadii.binar.chapter2.R

class Day9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day9)
        val tvOne = findViewById<TextView>(R.id.tv_one)
        tvOne.text = "ini value baru"

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

}
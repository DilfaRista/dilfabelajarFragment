package com.dilfa.dilfabelajarfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dilfa.fragment.firstfragment
import com.dilfa.fragment.secondfragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstfragment = firstfragment()
        val secondfragment = secondfragment()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.iframe, firstfragment)
            commit()
        }

        val btnfirstfragment = findViewById<Button>(R.id.btnfistfragment)
        val btnsecondfragment = findViewById<Button>(R.id.btnsecondfragment)

        btnfirstfragment.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.iframe, firstfragment)
                commit()
            }
        }
        btnsecondfragment.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.iframe, secondfragment)
                commit()
            }
        }
    }
}
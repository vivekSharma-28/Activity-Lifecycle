package com.example.activity_lifecycle

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Toast.makeText(this, "Activity Create", Toast.LENGTH_LONG).show()
        Log.e("@@@@@", "Activity Create")

        val textView = findViewById<TextView>(R.id.text)
        val button = findViewById<Button>(R.id.button)

        val fragment: Fragment = BlankFragment()

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        textView.setOnClickListener {
            val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.frame_container, fragment)
//            transaction.addToBackStack(null)
            transaction.commit()
        }
    }


    override fun onStart() {
        super.onStart()
        Log.e("@@@@@", "Activity Start")
//        Toast.makeText(this,"Activity Start",Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Log.e("@@@@@", "Activity Resume")
//        Toast.makeText(this,"Activity Resume",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.e("@@@@@", "Activity Pause")
//        Toast.makeText(this,"Activity Pause",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.e("@@@@@", "Activity Stop")
//        Toast.makeText(this, "Activity Stop", Toast.LENGTH_LONG).show()

    }

    override fun onRestart() {
        super.onRestart()
        Log.e("@@@@@", "Activity Restart")
//        Toast.makeText(this,"Activity Restart",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("@@@@@", "Activity Destroy")
//        Toast.makeText(this,"Activity Destroy",Toast.LENGTH_LONG).show()
    }
}
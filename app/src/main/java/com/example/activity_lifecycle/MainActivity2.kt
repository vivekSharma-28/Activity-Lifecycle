package com.example.activity_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var toast:Toast=Toast.makeText(this,"Activity2 Create",Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        var toast:Toast=Toast.makeText(this,"Activity2 Start",Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        var toast:Toast=Toast.makeText(this,"Activity2 Resume",Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()    }

    override fun onPause() {
        super.onPause()
        var toast:Toast=Toast.makeText(this,"Activity2 Pause",Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()    }

    override fun onStop() {
        super.onStop()
        var toast:Toast=Toast.makeText(this,"Activity2 Stop",Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()    }

    override fun onRestart() {
        super.onRestart()
        var toast:Toast=Toast.makeText(this,"Activity2 Restart",Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()    }

    override fun onDestroy() {
        super.onDestroy()
        var toast:Toast=Toast.makeText(this,"Activity2 Destroy",Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()    }
}
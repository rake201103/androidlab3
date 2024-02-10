package com.example.ramazan2107

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnBio= findViewById<Button>(R.id.btnBio)
        btnBio.setOnClickListener {
            intent= Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
        val btnprofile= findViewById<Button>(R.id.button2)
        btnprofile.setOnClickListener {
            val newlink= Intent(Intent.ACTION_VIEW)
            newlink.data= Uri.parse("https://github.com/rake201103")
            startActivity(newlink)
        }
        val btncamera= findViewById<Button>(R.id.btnCamera)
        btncamera.setOnClickListener {
            val opencamera= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(opencamera)
        }
    }
}
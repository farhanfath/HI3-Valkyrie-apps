package com.project.honkaiimpac3rd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutCaptain : AppCompatActivity() {

    private lateinit var profieName : TextView
    private lateinit var profileEmail : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_captain)

        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setTitle("About Captain")

        profieName = findViewById(R.id.profileNama)
        profileEmail = findViewById(R.id.profileEmail)

        profieName.setText(R.string.profileName)
        profileEmail.setText(R.string.profileEmail)

    }
}
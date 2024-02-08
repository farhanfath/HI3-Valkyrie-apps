package com.project.honkaiimpac3rd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutCaptain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_captain)

        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setTitle("About Captain")
    }
}
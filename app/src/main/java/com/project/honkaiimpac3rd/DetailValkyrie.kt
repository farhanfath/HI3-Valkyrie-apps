package com.project.honkaiimpac3rd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailValkyrie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_valkyrie)

        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setTitle("Varkyrie Details")
    }
}
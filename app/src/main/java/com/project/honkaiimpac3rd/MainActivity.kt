package com.project.honkaiimpac3rd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var RVvalk : RecyclerView
    private var list: ArrayList<valkFormat> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        change header title
        val actionBar = supportActionBar
        actionBar!!.setTitle("Honkai Impact 3rd")

        RVvalk = findViewById(R.id.valkRV)
        RVvalk.setHasFixedSize(true)

//        mengambil data dari database valkData sesuai dengan format listValk
        list.addAll(valkData.listValk)
        RVvalk.layoutManager = LinearLayoutManager(this)
        val listValkAdapter = valkListAdapter(list)
        RVvalk.adapter = listValkAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

//        use custom menu
        menuInflater.inflate(R.menu.custom_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        actionbarGo(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun actionbarGo(iconclicked: Int) {
        when (iconclicked) {
            R.id.profile -> {
                val goAbout = Intent(this@MainActivity, AboutCaptain::class.java)
                startActivity(goAbout)
            }
        }
    }
}
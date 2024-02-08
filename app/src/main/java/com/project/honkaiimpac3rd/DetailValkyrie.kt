package com.project.honkaiimpac3rd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetailValkyrie : AppCompatActivity() {

    //    float action button variable
    private lateinit var add: FloatingActionButton
    private lateinit var back: FloatingActionButton
    private lateinit var link: FloatingActionButton

    //    float action button animate
    private val rotateOpen: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.rotate_open_anim) }
    private val rotateClose: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.rotate_close_anim) }
    private val fromBottom: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.from_bottom_anim) }
    private val toBottom: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.to_bottom_anim) }

    //    clicked button
    private var clicked = false

    //    extraData variable
    companion object {
        const val EXTRA_BATTLESUIT = "extra_battlesuit"
        const val EXTRA_DETAILIMG = "extra_detailimg"
        const val EXTRA_BIO = "extra_bio"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_valkyrie)

        //        extra variable
        val battlesuit = intent.getStringExtra(EXTRA_BATTLESUIT)
        val detailimg = intent.getIntExtra(EXTRA_DETAILIMG, 0)
        val bio = intent.getStringExtra(EXTRA_BIO)

        //         xml variable
        val valkNameHead : TextView = findViewById(R.id.header_name)
        val valkImgDetail : ImageView = findViewById(R.id.detail_valkimg)
        val bioText : TextView = findViewById(R.id.valk_bio_text)

        //        insert the data from two variable
        valkNameHead.text = battlesuit
        bioText.text = bio
        Glide.with(this)
            .load(detailimg)
            .apply(RequestOptions())
            .into(valkImgDetail)

        //        floatingactionbutton
        add = findViewById(R.id.add_btn)
        back = findViewById(R.id.back_btn)
        link = findViewById(R.id.link_btn)

        add.setOnClickListener {
            onAddButtonClicked()
        }

        back.setOnClickListener {
            finish()
        }

        link.setOnClickListener {
            Toast.makeText(this, "test button link", Toast.LENGTH_SHORT).show()
        }

    }

    private fun onAddButtonClicked() {
        setVisibility(clicked)
        setAnimation(clicked)
        clicked = !clicked
    }

    private fun setVisibility(clicked: Boolean) {
        if(!clicked){
            back.visibility = View.VISIBLE
            link.visibility = View.VISIBLE
        }else{
            back.visibility = View.INVISIBLE
            link.visibility = View.INVISIBLE
        }
    }

    private fun setAnimation(clicked: Boolean) {
        if(!clicked){
            back.startAnimation(fromBottom)
            link.startAnimation(fromBottom)
            add.startAnimation(rotateOpen)
        }else{
            back.startAnimation(toBottom)
            link.startAnimation(toBottom)
            add.startAnimation(rotateClose)
        }
    }



}
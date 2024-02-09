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
import org.w3c.dom.Text

class DetailValkyrie : AppCompatActivity() {

    //    float action button variable
    private lateinit var add: FloatingActionButton
    private lateinit var back: FloatingActionButton
    private lateinit var link: FloatingActionButton

    //        type image
    private lateinit var typeIcon : ImageView

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
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_TYPE = "extra_type"
        const val EXTRA_FROM = "extra_from"
        const val EXTRA_KHAS = "extra_khas"
        const val EXTRA_PERSONALITY = "extra_personality"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_valkyrie)

        //        extra variable
        val battlesuit = intent.getStringExtra(EXTRA_BATTLESUIT)
        val detailimg = intent.getIntExtra(EXTRA_DETAILIMG, 0)
        val bio = intent.getStringExtra(EXTRA_BIO)
        val name = intent.getStringExtra(EXTRA_NAME)
        val type = intent.getStringExtra(EXTRA_TYPE)
        val from = intent.getStringExtra(EXTRA_FROM)
        val khas = intent.getStringExtra(EXTRA_KHAS)
        val personality = intent.getStringExtra(EXTRA_PERSONALITY)


        //         xml variable
        val valkNameHead : TextView = findViewById(R.id.header_name)
        val valkImgDetail : ImageView = findViewById(R.id.detail_valkimg)
        val bioText : TextView = findViewById(R.id.valk_bio_text)
        val detailname : TextView = findViewById(R.id.charname)
        val detailtype : TextView = findViewById(R.id.chartype)
        val valkfrom : TextView = findViewById(R.id.charfrom)
        val valkAppear : TextView = findViewById(R.id.valk_appearance_text)
        val valkPerson : TextView = findViewById(R.id.valk_personality_text)

        //        change type icon by condition
        typeIcon = findViewById(R.id.type_icon)
        when(type) {

            "MECH" -> {
                typeIcon.setImageResource(R.drawable.type_detail_mech)
            }
            "BIO" -> {
                typeIcon.setImageResource(R.drawable.type_detail_bio)
            }
            "PSY" -> {
                typeIcon.setImageResource(R.drawable.type_detail_psy)
            }
            "IMG" -> {
                typeIcon.setImageResource(R.drawable.type_detail_img)
            }
            "QUA" -> {
                typeIcon.setImageResource(R.drawable.type_detail_qua)
            }

        }

        //        insert the data from two variable
        detailname.text = name
        detailtype.text = type
        valkNameHead.text = battlesuit
        valkfrom.text = from
        bioText.text = bio
        valkAppear.text = khas
        valkPerson.text = personality
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


//    animation function

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
package com.project.honkaiimpac3rd

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget

class valkListAdapter (private val listValk: ArrayList<valkFormat>) :
    Adapter<valkListAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.name_char)
        var battleSuit: TextView = itemView.findViewById(R.id.battlesuit_char)
        var type : TextView = itemView.findViewById(R.id.type_char)
        var img : ImageView = itemView.findViewById(R.id.ImgValk)
        var cardtype : ConstraintLayout = itemView.findViewById(R.id.cardValk)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.list_char, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listValk.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val honkaiValk = listValk[position]
        val backgroundDrawable = ContextCompat.getDrawable(holder.itemView.context, honkaiValk.cardtype)
        Glide.with(holder.itemView.context)
            .load(honkaiValk.img)
            .apply(RequestOptions())
            .into(holder.img)
        holder.name.text = honkaiValk.name
        holder.battleSuit.text = honkaiValk.battlesuit
        holder.type.text = honkaiValk.type
        holder.cardtype.background = backgroundDrawable

//        for clickable to details activity
        holder.itemView.setOnClickListener {
            val detailValk = Intent(context, DetailValkyrie::class.java)
            context.startActivity(detailValk)
        }

    }

}
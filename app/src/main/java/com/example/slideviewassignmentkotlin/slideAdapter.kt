package com.example.slideviewassignmentkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class slideAdapter(private val slideList:ArrayList<DataSlide>) : RecyclerView.Adapter<slideAdapter.MyviewHolder>(){
    private lateinit var imgslide : ImageView


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return MyviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem=slideList[position]
        holder.imgslide.setImageResource(currentItem.slideimage)
        holder.txtname.setText(currentItem.slidename)

    }

    override fun getItemCount(): Int {
        return slideList.size
    }

    class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgslide:ShapeableImageView=itemView.findViewById(R.id.slideImage)
        val txtname:TextView=itemView.findViewById((R.id.slideName))

    }


}

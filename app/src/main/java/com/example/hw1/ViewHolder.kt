package com.example.hw1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val dog_pic: ImageView = view.findViewById(R.id.dog_pic)
    val species: TextView = view.findViewById(R.id.species)
    val age: TextView = view.findViewById(R.id.age2)
    val feature: TextView = view.findViewById(R.id.feature2)
    val place: TextView = view.findViewById(R.id.place2)

    fun bind(data:Item){

        Glide.with(itemView)
            .load(data.it_image)
            .into(dog_pic)
        //dog_pic.setImageDrawable(data.it_image)
        species.text=data.it_species
        age.text=data.it_age
        feature.text=data.it_feature
        place.text=data.it_place
    }

}
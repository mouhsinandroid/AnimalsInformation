package com.mouhsinbr.android.animalsinformation.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mouhsinbr.android.animalsinformation.R
import com.mouhsinbr.android.animalsinformation.model.Animal
import kotlinx.android.synthetic.main.item_animal.view.*
import java.util.zip.Inflater

class AnimalListAdapter(private val animalList: ArrayList<Animal>) : RecyclerView.Adapter<AnimalListAdapter.AnimalViewHolder>() {

    fun updateAnimalList(newAnimalList: List<Animal>) {
        animalList.clear()
        animalList.addAll(newAnimalList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_animal, parent, false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount() = animalList.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.view.animalName.text = animalList[position].name
    }

    class AnimalViewHolder(var view: View): RecyclerView.ViewHolder(view) {

    }



}
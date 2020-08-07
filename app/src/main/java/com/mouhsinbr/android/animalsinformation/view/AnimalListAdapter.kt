package com.mouhsinbr.android.animalsinformation.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.mouhsinbr.android.animalsinformation.R
import com.mouhsinbr.android.animalsinformation.databinding.ItemAnimalBinding
import com.mouhsinbr.android.animalsinformation.model.Animal
import com.mouhsinbr.android.animalsinformation.util.getProgressDrawable
import com.mouhsinbr.android.animalsinformation.util.loadImage
import kotlinx.android.synthetic.main.item_animal.view.*
import java.util.zip.Inflater

class AnimalListAdapter(private val animalList: ArrayList<Animal>) :
    RecyclerView.Adapter<AnimalListAdapter.AnimalViewHolder>(), AnimalClickListener {

    fun updateAnimalList(newAnimalList: List<Animal>) {
        animalList.clear()
        animalList.addAll(newAnimalList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemAnimalBinding>(inflater, R.layout.item_animal, parent, false)

        return AnimalViewHolder(binding)
    }

    override fun getItemCount() = animalList.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.view.animal = animalList[position]
        holder.view.listener = this
    }

    override fun onClick(v: View) {
        for (animal in animalList){
            if(v.tag == animal.name){
                val action = ListFragmentDirections.actionDetail(animal)
                Navigation.findNavController(v).navigate(action)
            }

        }
    }


    class AnimalViewHolder(var view: ItemAnimalBinding): RecyclerView.ViewHolder(view.root)



}
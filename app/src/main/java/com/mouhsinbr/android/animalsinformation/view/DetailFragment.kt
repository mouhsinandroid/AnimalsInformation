package com.mouhsinbr.android.animalsinformation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.mouhsinbr.android.animalsinformation.R
import com.mouhsinbr.android.animalsinformation.model.Animal
import com.mouhsinbr.android.animalsinformation.util.loadImage
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_list.*

class DetailFragment : Fragment() {

    var animal: Animal ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            animal = DetailFragmentArgs.fromBundle(it).animal
        }

        context?.let {
            animalImage.loadImage(animal?.imageUrl, CircularProgressDrawable(it))
        }

        animalName.text = animal?.name
        animalLocation.text = animal?.location
        animalLifeSpan.text = animal?.lifeSpan
        animalDiet.text = animal?.diet
    }

}
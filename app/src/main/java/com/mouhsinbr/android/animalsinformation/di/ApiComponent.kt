package com.mouhsinbr.android.animalsinformation.di

import com.mouhsinbr.android.animalsinformation.model.AnimalApiService
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun injectApi(service: AnimalApiService)
}
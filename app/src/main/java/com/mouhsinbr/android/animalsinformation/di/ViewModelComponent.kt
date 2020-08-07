package com.mouhsinbr.android.animalsinformation.di

import com.mouhsinbr.android.animalsinformation.model.AnimalApiService
import com.mouhsinbr.android.animalsinformation.viewmodel.ListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class, PrefsModule::class, AppModule::class])
interface ViewModelComponent {

    fun injectAnimalApiService(viewModel: ListViewModel)

}
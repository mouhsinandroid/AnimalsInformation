package com.mouhsinbr.android.animalsinformation

import com.mouhsinbr.android.animalsinformation.di.ApiModule
import com.mouhsinbr.android.animalsinformation.model.AnimalApiService

class ApiModuleTest(val mockService: AnimalApiService): ApiModule() {
    override fun provideAnimalApiService(): AnimalApiService {
        return mockService
    }
}
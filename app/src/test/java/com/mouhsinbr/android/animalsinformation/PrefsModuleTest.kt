package com.mouhsinbr.android.animalsinformation

import android.app.Application
import com.mouhsinbr.android.animalsinformation.di.PrefsModule
import com.mouhsinbr.android.animalsinformation.util.SharedPrefrencesHelper

class PrefsModuleTest(val mockPref: SharedPrefrencesHelper): PrefsModule() {
    override fun provideSharePreferences(app: Application): SharedPrefrencesHelper {
        return mockPref
    }
}
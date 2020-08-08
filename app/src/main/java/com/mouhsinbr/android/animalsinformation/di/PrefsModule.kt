package com.mouhsinbr.android.animalsinformation.di

import android.app.Activity
import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.mouhsinbr.android.animalsinformation.util.SharedPrefrencesHelper
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
open class PrefsModule {

    @Provides
    @Singleton
    @TypeOfContext(CONTEXT_APP)
    open fun provideSharePreferences(app: Application): SharedPrefrencesHelper {
        return SharedPrefrencesHelper(app)
    }

    @Provides
    @Singleton
    @TypeOfContext(CONTEXT_ACTIVITY)
    fun provideActivitySharedPreferences(activity: AppCompatActivity): SharedPrefrencesHelper {
        return SharedPrefrencesHelper(activity)
    }
}

const val CONTEXT_APP = "App context"
const val CONTEXT_ACTIVITY = "Activity context"

@Qualifier
annotation class TypeOfContext(val type: String)
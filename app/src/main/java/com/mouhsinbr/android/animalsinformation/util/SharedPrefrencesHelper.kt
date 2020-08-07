package com.mouhsinbr.android.animalsinformation.util

import android.content.Context
import android.preference.PreferenceManager

class SharedPrefrencesHelper(context: Context) {

    private val PREF_API_KEY = "Api key"

    private val pref = PreferenceManager.getDefaultSharedPreferences(context)

    fun saveApiKey(key: String?) {
        pref.edit().putString(PREF_API_KEY, key).apply()
    }

    fun getApiKey() = pref.getString(PREF_API_KEY, null)

}
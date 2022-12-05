package com.safbk.wordpress.mykotlinarchetecturewithkoindi.koinDi

import androidx.appcompat.app.AppCompatDelegate
import androidx.multidex.MultiDexApplication
import com.acclivousbyte.shopee.koinDi.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        //Below API 29 (for night mode off)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        startKoin {
            androidContext(this@BaseApplication)
            modules(listOf(retrofitModule, utilModule, mainModule, sharePrefModule))
        }

    }
}
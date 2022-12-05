package com.safbk.wordpress.mykotlinarchetecturewithkoindi.koinDi

import android.app.Application
import android.content.SharedPreferences
import com.safbk.wordpress.mykotlinarchetecturewithkoindi.api.DefaultRepository
import com.safbk.wordpress.mykotlinarchetecturewithkoindi.utils.MaterialDialogHelper
import com.safbk.wordpress.mykotlinarchetecturewithkoindi.utils.SharePreferenceHelper
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module


val utilModule = module {

    single { MaterialDialogHelper() }

    single { DefaultRepository(get()) }


    single{
        getSharedPrefs(androidApplication())
    }

    single<SharedPreferences.Editor> {
        getSharedPrefs(androidApplication()).edit()
    }

}

val sharePrefModule = module {
    single {
        SharePreferenceHelper(get())
    }
}


fun getSharedPrefs(androidApplication: Application): SharedPreferences{
    return  androidApplication.getSharedPreferences("default",  android.content.Context.MODE_PRIVATE)
}


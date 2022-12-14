package com.safbk.wordpress.mykotlinarchetecturewithkoindi.view.fragments

import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.ParametersDefinition
import kotlin.reflect.KClass


abstract class MainMVVMNavigationFragment <out VM : ViewModel> (
    viewModelClass: KClass<VM>,
    viewmodelParameters: ParametersDefinition? = null
): BaseFragment() {

    protected open val viewModel: VM by viewModel(
        clazz = viewModelClass,
        parameters = viewmodelParameters
    )
}
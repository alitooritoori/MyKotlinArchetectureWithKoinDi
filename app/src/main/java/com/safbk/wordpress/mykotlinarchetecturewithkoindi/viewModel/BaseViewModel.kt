package com.safbk.wordpress.mykotlinarchetecturewithkoindi.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.acclivousbyte.shopee.models.SnackbarMessage
import com.safbk.wordpress.mykotlinarchetecturewithkoindi.utils.Event
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

open class BaseViewModel: ViewModel() {

    val dispatcher = Dispatchers.Default

    private var _showHideProgressDialog = MutableLiveData<Event<Boolean>>()
    val showHideProgressDialog: LiveData<Event<Boolean>> get() = _showHideProgressDialog

    val snackbarData = MutableLiveData<Event<SnackbarMessage>>()
    protected fun showSnackbarMessage(message: SnackbarMessage) {
        snackbarData.value = Event(message)
    }

    protected fun showSnackbarMessage(message: String, positiveMsg: Boolean = false) {
        snackbarData.value =
            Event(SnackbarMessage(content = message, positiveMessage = positiveMsg))
    }


    suspend fun customDelay(millis: Long) = withContext(dispatcher) {
        delay(millis)
    }
}
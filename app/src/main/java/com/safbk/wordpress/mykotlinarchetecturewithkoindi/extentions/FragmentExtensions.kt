package com.safbk.wordpress.mykotlinarchetecturewithkoindi.extentions

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.afollestad.materialdialogs.MaterialDialog
import com.safbk.wordpress.mykotlinarchetecturewithkoindi.utils.Event
import com.safbk.wordpress.mykotlinarchetecturewithkoindi.utils.MaterialDialogHelper
import com.safbk.wordpress.mykotlinarchetecturewithkoindi.view.fragments.BaseFragment

fun BaseFragment.setupProgressDialog(
    showHideProgress: LiveData<Event<Boolean>>,
    dialogHelper: MaterialDialogHelper
) {
    var mDialog: MaterialDialog? = null
    showHideProgress.observe(this, Observer {
        if (!it.consumed) it.consume()?.let { flag ->
            if (flag)
                mDialog?.show() ?: dialogHelper.showSimpleProgress(requireContext())
                    .also { dialog ->
                        mDialog = dialog
                    }
            else mDialog?.dismiss()
        }
    })
}
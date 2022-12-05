package com.safbk.wordpress.mykotlinarchetecturewithkoindi.utils

import android.content.Context
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.safbk.wordpress.mykotlinarchetecturewithkoindi.R

class MaterialDialogHelper {

    fun showSimpleProgress(callingClassContext: Context): MaterialDialog {
        return MaterialDialog(callingClassContext).show {
            customView(
//                viewRes = R.layout.custom_progressbar,
                noVerticalPadding = true, dialogWrapContent = true
            )
            cancelOnTouchOutside(false)
            cancelable(false)
//            window?.setBackgroundDrawableResource(R.drawable.progress_dialog_rounded_bg)
            val layoutWidth = 300
            val layoutHeight = 250
            window?.setLayout(
//                layoutWidth, WindowManager.LayoutParams.WRAP_CONTENT
                layoutWidth, layoutHeight
            )
        }
    }
}
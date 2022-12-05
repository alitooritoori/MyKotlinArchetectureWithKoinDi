package com.safbk.wordpress.mykotlinarchetecturewithkoindi.extentions

import android.content.Context
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun Context.mutedColor(@ColorRes color: Int) = ContextCompat.getColor(this, color)

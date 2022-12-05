package com.acclivousbyte.shopee.utils

import com.safbk.wordpress.mykotlinarchetecturewithkoindi.utils.Event

fun <T> T.wrapWithEvent() = Event(this)

//val internetWorkerConstraints = Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED)
//    .build()
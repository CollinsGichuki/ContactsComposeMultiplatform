package com.plcoding.contactscomposemultiplatform.core.presentation

import android.graphics.BitmapFactory
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap

@Composable
actual fun rememberBitmapFromBytes(photoByteArray: ByteArray?): ImageBitmap? {
    return remember(photoByteArray) {
        if (photoByteArray != null) {
            BitmapFactory.decodeByteArray(photoByteArray, 0, photoByteArray.size).asImageBitmap()
        } else {
            null
        }
    }
}
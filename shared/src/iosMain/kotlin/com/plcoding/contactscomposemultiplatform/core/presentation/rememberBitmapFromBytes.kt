package com.plcoding.contactscomposemultiplatform.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asComposeImageBitmap
import org.jetbrains.skia.Bitmap
import org.jetbrains.skia.Image

@Composable
actual fun rememberBitmapFromBytes(photoByteArray: ByteArray?): ImageBitmap? {
    return remember(photoByteArray) {
        if (photoByteArray != null) {
            Bitmap.makeFromImage(
                Image.makeFromEncoded(photoByteArray)
            ).asComposeImageBitmap()
        } else {
            null
        }
    }
}
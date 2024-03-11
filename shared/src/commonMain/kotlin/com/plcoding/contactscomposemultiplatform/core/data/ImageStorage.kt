package com.plcoding.contactscomposemultiplatform.core.data

expect class ImageStorage {
    //We save the image location address in the db
    suspend fun saveImage(bytes: ByteArray): String
    suspend fun getImage(fileName: String): ByteArray?
    suspend fun deleteImage(fileName: String)
}
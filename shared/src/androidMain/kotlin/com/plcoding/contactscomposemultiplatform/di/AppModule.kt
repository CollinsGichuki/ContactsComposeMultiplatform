package com.plcoding.contactscomposemultiplatform.di

import android.content.Context
import com.plcoding.contactscomposemultiplatform.contacts.data.SQLDelightContactDataSource
import com.plcoding.contactscomposemultiplatform.contacts.domain.ContactDataSource
import com.plcoding.contactscomposemultiplatform.core.data.DatabaseDriverFactory
import com.plcoding.contactscomposemultiplatform.core.data.ImageStorage
import com.plcoding.contactscomposemultiplatform.database.ContactDatabase

actual class AppModule(
    private val context: Context
) {
    // Android's implementation of the db injection
    actual val contactDataSource: ContactDataSource by lazy {
        SQLDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory(context).create()
            ),
            imageStorage = ImageStorage(context)
        )
    }
}
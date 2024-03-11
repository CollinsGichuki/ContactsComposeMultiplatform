package com.plcoding.contactscomposemultiplatform.di

import com.plcoding.contactscomposemultiplatform.contacts.data.SQLDelightContactDataSource
import com.plcoding.contactscomposemultiplatform.contacts.domain.ContactDataSource
import com.plcoding.contactscomposemultiplatform.core.data.DatabaseDriverFactory
import com.plcoding.contactscomposemultiplatform.core.data.ImageStorage
import com.plcoding.contactscomposemultiplatform.database.ContactDatabase

actual class AppModule {
    // IOS's implementation of the db injection
    actual val contactDataSource: ContactDataSource by lazy {
        SQLDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory().create()
            ),
            imageStorage = ImageStorage()
        )
    }
}
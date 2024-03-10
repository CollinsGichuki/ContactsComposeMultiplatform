package com.plcoding.contactscomposemultiplatform.contacts.presentation

import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact

sealed interface ContactListEvent {
    // These are the events the user could do
    object OnAddNewContactClick: ContactListEvent
    object OnDismissContact: ContactListEvent
    data class OnFirstNameChanged(val value: String): ContactListEvent
    data class OnLastNameChanged(val value: String): ContactListEvent
    data class OnEmailChanged(val value: String): ContactListEvent
    data class OnPhoneNumberChanged(val value: String): ContactListEvent
    data class OnPhotoPicked(val photoBytes: ByteArray): ContactListEvent
    object OnAddPhotoClicked: ContactListEvent
    object SaveContact: ContactListEvent
    object DeleteContact: ContactListEvent
    data class SelectContact(val contact: Contact): ContactListEvent
    data class EditContact(val contact: Contact): ContactListEvent

}
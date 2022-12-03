package com.nazarka_labs.important_notes.ui.notes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Сюди скоро додасться контент з фейсбуку"
    }
    val text: LiveData<String> = _text
}
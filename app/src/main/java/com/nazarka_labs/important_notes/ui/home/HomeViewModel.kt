package com.nazarka_labs.important_notes.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Чистий андроїд судячи з усього не дуже розрахований на створення всіх варіантів інтерактивного контенту..."
    }
    val text: LiveData<String> = _text
}
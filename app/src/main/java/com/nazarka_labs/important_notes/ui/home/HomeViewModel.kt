package com.nazarka_labs.important_notes.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "«Мозок наркомана точно не здатен сформулювати нічого нового, що могло би бути корисно або цікаво для людиней не орієнтованих на психічні розлади. Натомість здатен використовувати будь-яку з наявних можливостей для заспокоєння власної шизофренії, в тому числі шляхом незпровокованої помсти...» Дмитро Дурач"
    }
    val text: LiveData<String> = _text
}
package com.example.beraniyuk

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var pesanku by mutableStateOf("Mau nda jadi pacarku?")
        private set

    var hidetombolmau by mutableStateOf(1f)
        private set
    var enabtombolmau by mutableStateOf(true)
        private set

    var hidetombol1 by mutableStateOf(1f)
        private set
    var enabtombol1 by mutableStateOf(true)
        private set

    var hidetombol2 by mutableStateOf(0f)
        private set
    var enabtombol2 by mutableStateOf(false)
        private set

    var hidetombol3 by mutableStateOf(0f)
        private set
    var enabtombol3 by mutableStateOf(false)
        private set

    var hidetombol4 by mutableStateOf(0f)
        private set
    var enabtombol4 by mutableStateOf(false)
        private set


    fun tombolmau(){
        pesanku = "Okay kita pacaran, tapi aku mau kita PUTUS!!!"

        hidetombolmau = 0f
        enabtombolmau = false

        hidetombol1 = 0f
        enabtombol1 = false

        hidetombol2 = 0f
        enabtombol2 = false

        hidetombol3 = 0f
        enabtombol3 = false

        hidetombol4 = 0f
        enabtombol4 = false
    }

    fun tombol1click(){
        hidetombol1 = 0f
        enabtombol1 = false

        hidetombol2 = 1f
        enabtombol2 = true
    }

    fun tombol2click(){
        hidetombol2 = 0f
        enabtombol2 = false

        hidetombol3 = 1f
        enabtombol3 = true
    }

    fun tombol3click(){
        hidetombol3 = 0f
        enabtombol3 = false

        hidetombol4 = 1f
        enabtombol4 = true
    }

    fun tombol4click(){
        hidetombol4 = 0f
        enabtombol4 = false

        hidetombol1 = 1f
        enabtombol1 = true
    }


}
package com.marquez.smlab06_musicfast.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class Music (
    val id:Int,
    val musicName:String,
    val artistName:String,
    val picture:String,
    val genero:String
)
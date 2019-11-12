package com.tjoeum.a20191112_02_library

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    abstract fun setValues()

    abstract fun setupEvents()

}
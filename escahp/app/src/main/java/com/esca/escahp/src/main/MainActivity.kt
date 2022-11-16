package com.esca.escahp.src.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.esca.escahp.R
import com.esca.escahp.config.BaseActivity
import com.esca.escahp.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val TAG = "MainActivity"
    override val layoutRes = R.layout.activity_main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
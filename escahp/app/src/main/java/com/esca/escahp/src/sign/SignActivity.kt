package com.esca.escahp.src.sign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.esca.escahp.R
import com.esca.escahp.config.BaseActivity
import com.esca.escahp.databinding.ActivitySignBinding

class SignActivity : BaseActivity<ActivitySignBinding>() {
    override val TAG: String
        get() = "SignActivity"
    override val layoutRes: Int
        get() = R.layout.activity_sign


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
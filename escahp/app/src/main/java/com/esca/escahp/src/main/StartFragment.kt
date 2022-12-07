package com.esca.escahp.src.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.esca.escahp.R
import com.esca.escahp.config.BaseFragment
import com.esca.escahp.databinding.FragmentStartBinding


class StartFragment : BaseFragment<FragmentStartBinding>() {
    override val TAG: String
        get() = "StartFragment"
    override val layoutRes: Int
        get() = R.layout.fragment_start

    override fun init() {
        // TODO("Not yet implemented")
    }

}
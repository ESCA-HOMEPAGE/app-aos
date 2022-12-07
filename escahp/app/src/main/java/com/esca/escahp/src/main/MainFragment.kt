package com.esca.escahp.src.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.esca.escahp.R
import com.esca.escahp.config.BaseFragment
import com.esca.escahp.databinding.FragmentMainBinding


class MainFragment : BaseFragment<FragmentMainBinding>() {
    override val TAG: String
        get() = "MainFragment"
    override val layoutRes: Int
        get() = R.layout.fragment_main


    override fun init() {
        // TODO("Not yet implemented")
    }
}
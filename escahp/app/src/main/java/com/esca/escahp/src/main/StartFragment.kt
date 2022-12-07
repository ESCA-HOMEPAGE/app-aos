package com.esca.escahp.src.main

import com.esca.escahp.R
import com.esca.escahp.config.BaseFragment
import com.esca.escahp.databinding.FragmentStartBinding


class StartFragment : BaseFragment<FragmentStartBinding>() {
    override val TAG: String
        get() = "StartFragment"
    override val layoutRes: Int
        get() = R.layout.fragment_start

    override fun init() {
        setEvent()
    }

    private fun setEvent() {
        binding.btnStartFLogin.setOnClickListener {
            // TODO : go login page
        }
        binding.tvStartFSignup.setOnClickListener {
            // TODO : go signup page
        }
    }

}
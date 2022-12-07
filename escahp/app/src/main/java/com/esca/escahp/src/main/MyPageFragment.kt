package com.esca.escahp.src.main

import com.esca.escahp.R
import com.esca.escahp.config.BaseFragment
import com.esca.escahp.databinding.FragmentMyPageBinding


class MyPageFragment : BaseFragment<FragmentMyPageBinding>() {
    override val TAG: String
        get() = "MyPageFragment"
    override val layoutRes: Int
        get() = R.layout.fragment_my_page

    override fun init() {
        // TODO("Not yet implemented")
    }

}
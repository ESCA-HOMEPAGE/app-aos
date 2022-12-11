package com.esca.escahp.src.main

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.esca.escahp.R
import com.esca.escahp.config.BaseFragment
import com.esca.escahp.databinding.FragmentMainBinding


class MainFragment : BaseFragment<FragmentMainBinding>() {
    override val TAG: String
        get() = "MainFragment"
    override val layoutRes: Int
        get() = R.layout.fragment_main


    override fun init() {
        val navHostFragment = childFragmentManager.findFragmentById(R.id.fcv_mainF_host) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bnvMainF, navController)
    }
}
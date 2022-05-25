package com.example.feature_advance_account.firstScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.feature_advance_account.base.StepFragment
import com.example.feature_advance_account.databinding.FragmentFirstBinding
import org.koin.core.module.Module
import org.koin.dsl.module

class FirstFragment : StepFragment() {

    lateinit var binding: FragmentFirstBinding

    override val modules: Module = module {  }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        stepActivity
            ?.setToolbarTitle("Primeiro fragmento")
            ?.showToolbarHome(true)
        binding.buttonFirst.setOnClickListener { onNext() }
    }
}
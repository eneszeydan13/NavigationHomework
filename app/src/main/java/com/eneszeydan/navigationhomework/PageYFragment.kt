package com.eneszeydan.navigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eneszeydan.navigationhomework.databinding.FragmentPageYBinding


class PageYFragment : Fragment() {

    private lateinit var binding : FragmentPageYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageYBinding.inflate(inflater, container, false)
        return binding.root
    }

}
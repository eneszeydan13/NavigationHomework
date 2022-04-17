package com.eneszeydan.navigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eneszeydan.navigationhomework.databinding.FragmentPageXBinding


class PageXFragment : Fragment() {

    private lateinit var binding:FragmentPageXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageXBinding.inflate(inflater, container, false)

        binding.buttonGoY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.goToPageYFromX)
        }

        return binding.root
    }

}
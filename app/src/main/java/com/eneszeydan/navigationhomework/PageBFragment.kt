package com.eneszeydan.navigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eneszeydan.navigationhomework.databinding.FragmentPageBBinding


class PageBFragment : Fragment() {

    private lateinit var binding: FragmentPageBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageBBinding.inflate(inflater, container, false)

        binding.buttonGoY2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.goToPageY)
        }

        return binding.root
    }


}
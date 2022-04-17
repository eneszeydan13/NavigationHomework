package com.eneszeydan.navigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eneszeydan.navigationhomework.databinding.FragmentHomepageBinding


class HomepageFragment : Fragment() {

    private lateinit var binding:FragmentHomepageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomepageBinding.inflate(inflater, container, false)

        binding.apply {
            buttonGoA.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.goToPageA)
            }

            buttonGoX.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.goToPageX)
            }
        }

        return binding.root
    }


}
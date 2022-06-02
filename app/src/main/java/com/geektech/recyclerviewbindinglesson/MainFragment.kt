package com.geektech.recyclerviewbindinglesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.recyclerviewbindinglesson.databinding.FragmentMainBinding


class MainFragment : Fragment() {
 private lateinit var binding:FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(
            LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = arrayListOf(Person("Madina", "Galiaskarova", "20"), Person("MAdina", "Galiaskaroca", "25"))
        data.add(Person("Koshka", "Koshka", "25"))


        val adapter = NameAdapter(data)
        binding.recycler.adapter = adapter
    }





}


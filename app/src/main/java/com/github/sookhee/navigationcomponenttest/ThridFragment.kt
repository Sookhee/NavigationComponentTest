package com.github.sookhee.navigationcomponenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.sookhee.navigationcomponenttest.databinding.FragmentThirdBinding

class ThridFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }
}

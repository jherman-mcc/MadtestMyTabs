package com.example.testmytabs.ui.help

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testmytabs.R
import com.example.testmytabs.ui.dashboard.DashboardViewModel

class HelpFragment : Fragment() {

private lateinit var helpViewModel: HelpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        helpViewModel = ViewModelProvider(this).get(HelpViewModel::class.java)
        return inflater.inflate(R.layout.help_fragment, container, false)
    }

}
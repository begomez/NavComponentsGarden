package com.example.navcomponents.flow


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navcomponents.R
import kotlinx.android.synthetic.main.fragment_flow_step3.*


/**
 * Content for sample flow module.
 *
 * Created by bernatgomez on July,2019
 */
class FlowFragmentStep3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_flow_step3, container, false)
    }

    override fun onStart() {
        super.onStart()

        this.setListeners()
    }

    private fun setListeners() = this.step3_main_btn.setOnClickListener { this.findNavController().navigate(R.id.home_dest) }
}

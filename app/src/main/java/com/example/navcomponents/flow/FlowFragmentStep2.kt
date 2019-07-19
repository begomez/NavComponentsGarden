package com.example.navcomponents.flow


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navcomponents.R


/**
 * A simple [Fragment] subclass.
 *
 */
class FlowFragmentStep2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_flow_fragment_step2, container, false)
    }


}

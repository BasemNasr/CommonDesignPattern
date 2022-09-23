package com.bn.commondesignpattern.ObserverPatterns.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ToggleButton
import com.bn.commondesignpattern.ObserverPatterns.Observer
import com.bn.commondesignpattern.R




class SecondFragment : Fragment(), Observer {

    private var textView:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.tvText)
    }

    companion object {
        fun newInstance(param1: String, param2: String) =
            SecondFragment().apply {
            }
    }

    override fun update(checked: Boolean) {
        if (checked) {
            textView?.text = "ON";
        } else {
            textView?.text = "OFF";
        }
    }
}
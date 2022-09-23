package com.bn.commondesignpattern.ObserverPattern.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ToggleButton
import androidx.fragment.app.Fragment
import com.bn.commondesignpattern.ObserverPattern.Observer
import com.bn.commondesignpattern.ObserverPattern.Subject
import com.bn.commondesignpattern.R


class ThirdFragment : Fragment(), Subject {

    private var observers: ArrayList<Observer>?  = ArrayList()
    private var button: ToggleButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        button = view.findViewById(R.id.toggle_button) as ToggleButton
        button!!.setOnClickListener({ notifyObservers() })
    }


    override fun register(observer: Observer?) {
        if (!observers!!.contains(observer)) {
            observers!!.add(observer!!)
        }
    }

    override fun unregister(observer: Observer?) {
        observers?.remove(observer!!)
    }

    override fun notifyObservers() {
        for (observer in observers!!) {
            observer.update(button!!.isChecked)
        }
    }
}
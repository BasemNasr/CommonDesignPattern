package com.bn.commondesignpattern.ObserverPattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.bn.commondesignpattern.ObserverPattern.fragments.SecondFragment
import com.bn.commondesignpattern.ObserverPattern.fragments.ThirdFragment
import com.bn.commondesignpattern.R

class ObserverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer)


        val fm: FragmentManager = supportFragmentManager
        val thirdFragment = ThirdFragment()
        val secondFragment = SecondFragment()
        fm.beginTransaction().replace(R.id.fragment_one, thirdFragment).commit()
        fm.beginTransaction().replace(R.id.fragment_two, secondFragment).commit()


        thirdFragment.register(secondFragment)

    }
}
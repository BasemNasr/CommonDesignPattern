package com.bn.commondesignpattern.BuilderPattern.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bn.commondesignpattern.R
import com.bn.commondesignpattern.BuilderPattern.data.PersonalComputer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Builder Pattern
        PersonalComputer.Builder("i5")
            .setRam("16G")
            .setScreenSize("14inch")
            .build()



    }
}
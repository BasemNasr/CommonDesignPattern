package com.bn.commondesignpattern.StrategyPattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bn.commondesignpattern.R
import com.bn.commondesignpattern.StrategyPattern.data.Item
import com.bn.commondesignpattern.StrategyPattern.stratagies.FilterManager
import com.bn.commondesignpattern.StrategyPattern.stratagies.GenreFilter
import com.bn.commondesignpattern.StrategyPattern.stratagies.RateFilter
import com.bn.commondesignpattern.StrategyPattern.stratagies.YearFilter


class StrategyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strategy)

        var rateList: ArrayList<Item> = ArrayList()
        var genereList: ArrayList<Item> = ArrayList()
        var yearList: ArrayList<Item> = ArrayList()



        var filteredList: ArrayList<Item> = ArrayList()
        var originalList: ArrayList<Item> = ArrayList()

        val rateFilter = RateFilter()
        rateFilter.setValue(1)

        val yearFilter = YearFilter()
        yearFilter.setValue(2)

        val genreFilter = GenreFilter()
        genreFilter.setValue(0)

        filteredList =
            FilterManager().applyFilters(originalList, genreFilter, rateFilter, yearFilter)


        // holla i'm filtered list
    }
}
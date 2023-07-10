package com.bn.commondesignpattern.StrategyPattern.stratagies

import com.bn.commondesignpattern.StrategyPattern.Filter
import com.bn.commondesignpattern.StrategyPattern.Filterable
import com.bn.commondesignpattern.StrategyPattern.data.Item


class GenreFilter : Filter<Int?>(), Filterable {

    override fun applyFilter(arrayList: ArrayList<Item>): ArrayList<Item> {
        return if (value == null) {
            arrayList
        } else {
            val newArrayList: ArrayList<Item> = ArrayList()
            for (i in 0 until arrayList.size) {
                val tmp: Int = arrayList[i].rateID
                if (value!! <= tmp) newArrayList.add(arrayList[i])
            }
            newArrayList
        }
    }


}

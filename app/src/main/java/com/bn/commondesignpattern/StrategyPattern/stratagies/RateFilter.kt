package com.bn.commondesignpattern.StrategyPattern.stratagies

import com.bn.commondesignpattern.StrategyPattern.Filter
import com.bn.commondesignpattern.StrategyPattern.Filterable
import com.bn.commondesignpattern.StrategyPattern.data.Item


class RateFilter : Filter<Int?>(), Filterable {

    override fun applyFilter(arrayList: ArrayList<Item>): ArrayList<Item> {
        return if (value == null) {
            arrayList
        } else {
            val newArrayList: ArrayList<Item> = ArrayList()
            for (i in arrayList.indices) {
                val tmp: Int = arrayList[i].rateID
                if (tmp == value) newArrayList.add(arrayList[i])
            }
            newArrayList
        }
    }


}

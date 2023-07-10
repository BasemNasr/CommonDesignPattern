package com.bn.commondesignpattern.StrategyPattern.stratagies

import com.bn.commondesignpattern.StrategyPattern.Filterable
import com.bn.commondesignpattern.StrategyPattern.data.Item


class FilterManager {
    fun applyFilters(arrayList: ArrayList<Item>, vararg filters: Filterable): ArrayList<Item> {
        var filteredList: ArrayList<Item> = ArrayList(arrayList)
        for (f in filters) {
            filteredList = f.applyFilter(filteredList)
        }
        return filteredList
    }
}
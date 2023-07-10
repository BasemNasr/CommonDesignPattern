package com.bn.commondesignpattern.StrategyPattern

import com.bn.commondesignpattern.StrategyPattern.data.Item


interface Filterable {
    fun applyFilter(arrayList: ArrayList<Item>): ArrayList<Item>
}

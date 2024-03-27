package com.wallet

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter


class CardViewPagerAdapter(fragmentActivity: CardFragment) : FragmentStateAdapter(fragmentActivity) {
    private val items = mutableListOf<CardItem>()

    override fun getItemCount(): Int = items.size

    override fun createFragment(position: Int): Fragment {

        return CardFragment.newInstance(items[position])
    }

    fun addTextItem(text: String) {
        val newItem = CardItem(text)
        items.add(newItem)
        notifyDataSetChanged()
    }

    fun addItem(item: CardItem) {
        items.add(item)
        notifyDataSetChanged()
    }


}
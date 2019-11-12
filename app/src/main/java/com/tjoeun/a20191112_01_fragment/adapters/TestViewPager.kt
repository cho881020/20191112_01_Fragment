package com.tjoeun.a20191112_01_fragment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tjoeun.a20191112_01_fragment.fragments.FirstFragment
import com.tjoeun.a20191112_01_fragment.fragments.SecondFragment

class TestViewPager(fm:FragmentManager) : FragmentPagerAdapter(fm) {

//    각 위치에 어떤 Fragment를 보여줄건지
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return FirstFragment()
        }
        else {
            return SecondFragment()
        }
    }

//    몇개의 페이지를 운영할건지
    override fun getCount(): Int {
        return 2
    }
}
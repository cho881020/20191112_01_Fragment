package com.tjoeun.a20191112_01_fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tjoeun.a20191112_01_fragment.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

//    액티비티 위에 얹어졌을때 실행되는 fun
//    실질적으로 fragment 입장에서는 onCreate나 마찬가지.
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        firstFragTxt.text = "프래그먼트에서 글자 바꿈"

    }

}








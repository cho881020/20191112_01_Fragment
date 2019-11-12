package com.tjoeun.a20191112_01_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191112_01_fragment.adapters.TestViewPager
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        testViewPager.adapter = TestViewPager(supportFragmentManager)
    }

}

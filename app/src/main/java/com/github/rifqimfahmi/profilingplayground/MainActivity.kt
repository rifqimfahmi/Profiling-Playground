package com.github.rifqimfahmi.profilingplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        small.setOnClickListener { executeSmallLoop() }
        medium.setOnClickListener { executeMediumLoop() }
        large.setOnClickListener { executeLargeLoop() }
        enormous.setOnClickListener { executeEnormousLoop() }
        monstrosity.setOnClickListener { executeMonstrosityLoop() }
    }

    private fun executeSmallLoop() {
        for (i in 0..100) {
//            doNothing()
            allocateObject(i)
        }
        setLoopResult("Small Done")
    }

    private fun executeMediumLoop() {
        for (i in 0..10_000) {
//            doNothing()
            allocateObject(i)
        }
        setLoopResult("Medium Done")
    }

    private fun executeLargeLoop() {
        for (i in 0..1_000_000) {
//            doNothing()
            allocateObject(i)
        }
        setLoopResult("Large Done")
    }

    private fun executeEnormousLoop() {
        for (i in 0..1_000_000_000) {
//            doNothing()
            allocateObject(i)
        }
        setLoopResult("Enormous Done")
    }

    private fun executeMonstrosityLoop() {
        for (i in 0..1_000_000_000_000) {
            doNothing()
        }
        setLoopResult("Monstrosity Done")
    }

    private fun setLoopResult(s: String) {
        result.text = s
    }

    private fun doNothing() {

    }

    private fun allocateObject(i: Int) {
        val theInt = DummyAlloc(i)
    }
}

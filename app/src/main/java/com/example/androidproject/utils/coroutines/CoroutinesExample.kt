package com.example.androidproject.utils.coroutines

import android.util.Log
import kotlinx.coroutines.*

class CoroutinesExample {

    fun testCouroutines() {
        CoroutineScope(Dispatchers.IO).launch {
            val job = launch {
                for (i in 1..5) {
                    Log.w("called", "$i")
                    delay(400)
                }
            }
            Log.w("start", "started")
            job.join()
            Log.w("finish", "finished")
        }
    }

    fun testCoroutinesCancel(){
        CoroutineScope(CoroutineName("TMS Lesson 28") + Dispatchers.IO).launch {
            val job = launch {
                for (i in 1..5) {
                    Log.w("called", "$i")
                    delay(400)
                }
            }
            Log.w("start", "started")
            job.cancel()
            Log.w("finish", "${coroutineContext[CoroutineName.Key]}")
        }
    }
}
package com.radiance.testlibrary

import android.util.Log

class TestHelper {
    companion object {
        private var testHelper: TestHelper? = null
        fun getInstance(): TestHelper? {
            if (testHelper == null) {
                testHelper = TestHelper()
            }
            return testHelper
        }
    }

    fun printSDKLog(msg: String) {
        Log.e("TestHelper", "printSDKLog: $msg")
    }
}
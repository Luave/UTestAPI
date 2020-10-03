package com.example.a1909

import okhttp3.*

class ClassTest {
    private val okHttpClient = OkHttpClient.Builder().build()
    fun req(url: String): Response {
        return okHttpClient.newCall(Request.Builder().url(url).build()).execute()
    }
}
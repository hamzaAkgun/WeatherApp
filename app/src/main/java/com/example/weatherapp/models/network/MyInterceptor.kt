package com.example.weatherapp.models.network

import okhttp3.Interceptor
import okhttp3.Response

class MyInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("X-Auth-Token","b436b42ca3a09ec2be22bab6f4d08209")
            .build()
        return chain.proceed(request)
    }
}
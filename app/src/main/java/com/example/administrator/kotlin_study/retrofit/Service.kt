package com.example.administrator.kotlin_study.retrofit

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by yang.jianan on 2017/07/19 13:56.
 * Kotlin 中使用 Retrofit2 ：学习地址 https://v.qq.com/x/page/t0342thu1al.html
 */
interface GithubService {
    @GET("https://api.github.com/repos/enbandari/Kotlin-Tutorials/stargazers")
    fun getStarGazers(): Call<List<User>>
}

object Service {
    val gs: GithubService by lazy {
        Retrofit.Builder().baseUrl("https://api.github.com").addConverterFactory(GsonConverterFactory.create()).build().create(GithubService::class.java)
    }
}

fun main(args: Array<String>) {
    Service.gs.getStarGazers().execute().body()?.map { print("$it\n") }
}


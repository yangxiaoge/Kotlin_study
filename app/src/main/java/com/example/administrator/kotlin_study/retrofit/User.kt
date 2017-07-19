package com.example.administrator.kotlin_study.retrofit

/**
 * Created by yang.jianan on 2017/07/19 13:58.
 */
data class User(val login: String, val id: Long, val avatar_url: String){
    override fun toString(): String {
//        return super.toString()
        return login
    }
}
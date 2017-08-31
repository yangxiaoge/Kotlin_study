package com.example.administrator.kotlin_study.chapter2

/**
 * Created by yang.jianan on 2017/08/31 12:23.
 * Des: 区间 Range
 */

val range: IntRange = 0..1024
val range_exclusiver: IntRange = 0 until 1024 //[0,1024) = [0,1023]
val range_empty: IntRange = 0..-1

fun main(args: Array<String>) {
    print(range.contains(66))
    print(range_empty.isEmpty())

    //遍历
    for (i in range_exclusiver) {
        print("$i,")
    }
}
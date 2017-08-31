package com.example.administrator.kotlin_study.factorial

import java.math.BigInteger
import javax.xml.transform.Source

/**
 * Created by yang.jianan on 2017/07/19 14:27.
 * 求阶乘  n!
 */
class Result(var value: BigInteger = BigInteger.valueOf(1L))

tailrec fun factorial(num: Int,result: Result) {
    if (num == 0) result.value = result.value.times(BigInteger.valueOf(1L))
    else
        result.value = result.value.times(BigInteger.valueOf(num.toLong()))
        factorial(num-1,result)
}

fun main(args: Array<String>) {
    var result = Result()
    factorial(5,result)
    print(result.value)
}


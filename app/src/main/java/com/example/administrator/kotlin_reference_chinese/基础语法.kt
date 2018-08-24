package com.example.administrator.kotlin_reference_chinese

import java.io.File

/**
 * Created by yangjianan on 2018/8/24.
 */

fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun main(args: Array<String>) {
    println("3 + 6 = " + sum(3, 6))

    println(printSum(1, 3))

    val list = listOf("ad", "adf")
    for (s in list) {
        println(s)
    }

    for (index in list.indices) {
        println(index)
        println("item at $index is ${list[index]}")
    }

    if (9 in 1..9){
        println("在")
    }

    val items = setOf("apple","banana","peer")
    when{
        "apple" in items -> println("apple in")
        "app" in items -> println("APP in")
    }

    //sampleStart
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit","a2323")
    fruits
            .filter { it.startsWith("a") } // 过滤
            .sortedBy { it } // 排序
            .map { it.toUpperCase() } // 映射，也就是修改元素
            .forEach { println(it) }
    //sampleEnd
    val person1 = Person("hha",0)
    println(person1)
    val copy = person1.copy(name = "666")
    println(copy)

    // 解构声明
    val(name,sex) = copy
    println("$name $sex")

    // 遍历 map/pair 型 list
    // val map = mapOf("a" to a, "b" to b, "c" to c)
    val map = HashMap<String,String>()
    map["a"] ="a"
    map["b"] ="b"
    map["c"] ="c"
    map.forEach {  println(it.key +" "+ it.value)}
    for ((k,v) in map){
        println("$k -> $v")
    }

    // 延时属性 lazy 懒加载
    val ss:String by lazy {
        "延时初始化"
    }
    ss.hahah()
    println(Resource.name)

    val files = File("Test").listFiles()
    println(files?.size) // ? 标识可为 null
    println(files?.size?:"空的")
    val feileSize = files?.size?:throw NullPointerException("files 为空，或者 size 为空")


}
//扩展函数
fun String.hahah(){
    println("扩展函数")
}

// 创建单例
object Resource {
    val name = "常量"
}

data class Person(val name: String,val sex:Int) {
    var age: Int = 0
}
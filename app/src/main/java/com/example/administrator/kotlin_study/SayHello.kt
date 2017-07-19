package com.example.administrator.kotlin_study

/**
 * Created by yang.jianan on 2017/07/17 11:50.
 * https://v.qq.com/x/page/t0337iacg09.html
 */
enum class Lang(val hello: String) {
    ENGLISH("hello"),
    CHINESE("你好"),
    JAPANESE("こんにちは"),
    KOREAN("안녕하세요");

    fun sayHello() {
        print(hello)
    }

    companion object {
        fun parse(name: String): Lang {
            return Lang.valueOf(name.toUpperCase())
        }
    }
}

fun main(args: Array<String>) {
    if (args.isEmpty()) return

    var lang = Lang.parse(args[0])
    print(lang)
    print("\n")
    lang.sayHello()
    print("\n")
    lang.sayBye()
}

private fun Lang.sayBye() {
    val bye = when(this){
        Lang.ENGLISH -> "bye"
        Lang.CHINESE -> "再见"
        Lang.JAPANESE -> "さようなら"
        Lang.KOREAN -> "안녕히 가세요"
    }
    print(bye)
}

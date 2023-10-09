package com.example.kotlinpractice

import androidx.compose.ui.text.toUpperCase

fun main(){
ignoreNulls("john")
}

fun helloWorld() : Unit{
    println("Hello World!")
    println(add(1, 2))
}

fun add(a: Int, b : Int) : Int {
    return a + b
}

fun hi() {
    val a : Int = 10

    var b : Int = 9

    b = 100

    val c = 100
    var d = 200

    var name = "John"
}

//4. 조건식
fun maxBy(a : Int, b : Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if (a > b) a else b

//when이 뭐지?
fun checkNum(score: Int) {
    when (score) {
        0 -> println("This is 0")
        1 -> println("This is 1")
        2, 3 -> println("This is 2 or 3")
    }

    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when (score) {
        in 90..100 -> println("You're genius!")
        in 10..80 -> println("not bad..")
        else -> println("Cheer up!")
    }
}

//5. Array vs List
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "a", 3.14f)
    val list2 = listOf(1, "a", 11L)

    array[0] = 4
    var result = list.get(0)
    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

//6. for/while
fun forAndWhile() {
    val students = arrayListOf("John", "James", "Tom", "Chris")
    for (name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index + 1}번째 학생: ${name}")
    }
    var sum : Int = 0
    for (i in 1 until 10) {
        sum += i
    }
    println(sum)

    var index = 0
    while (index < 10) {
        println("Current index : ${index}")
        index++
    }

}

//7. NonNull/Nullable
fun nullcheck() {
    //NPE: Null pointer Exception

    var name : String = "John" //null 불가
    var nullName : String? = null //null 가능

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?: 엘비스 연산자

    val lastName : String? = null
    val fullName = name + " " + (lastName?: "NO lastName")
    println(nameInUpperCase)
    println(fullName)


}
//!! - 컴파일러에게 null이 아님을 보증함 따라서 컴파일러는 null이 들어올 가능성을 배제함
fun ignoreNulls(str: String?) {
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()
    println(upper)

    //let
    val email : String? = "abcd@naver.com"
    email?.let{
        println("My email is ${email}")
    }
}
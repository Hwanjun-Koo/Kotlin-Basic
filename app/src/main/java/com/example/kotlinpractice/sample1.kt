package com.example.kotlinpractice

fun main(){
checkNum(1)
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
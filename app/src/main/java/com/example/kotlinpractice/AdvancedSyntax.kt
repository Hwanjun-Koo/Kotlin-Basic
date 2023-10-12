package com.example.kotlinpractice

//1.Lambda
//람다식은 우리가 마치 value 처럼 다룰 수 있는 익명 함수

val square : (Int) -> (Int) = {number -> number * number}
val nameAge = {name : String, age : Int ->
    "My name is ${name} I'm ${age}"
}
fun main() {
    println(square(12))
    println(nameAge("John", 24))
    val a = "John said"

    println(a.pizzaIsGreat())

    println(extendString("Koo", 24))

    println(calculateGrade(97))

    val lambda = {number : Double ->
        number == 4.3213
    }

    println(invokeLambda(lambda))
    println(invokeLambda({ it > 3.22 }))//lambda literal
    invokeLambda { it > 3.22 } //마지막 파라미터가 람다식일 때
}

//확장함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name: String, age: Int): String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 return
val calculateGrade : (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 표현하는 여러 방법
fun invokeLambda(lambda: (Double) -> Boolean) : Boolean {
    return lambda(5.2343)
}
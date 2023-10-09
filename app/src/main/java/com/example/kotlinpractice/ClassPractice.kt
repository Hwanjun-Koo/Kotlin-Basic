package com.example.kotlinpractice

open class Human (val name : String = "Anonymous") {

    constructor(name: String, age: Int) : this(name){
        println("My name is ${name}, ${age} years old")
    }
    init {
        println("New human has been born!")
    }
    fun eatingCake() {
        println("This is so yummy!")
    }

    open fun sing() {
        println("LaLaLa")
    }
}

//상속
class Korean : Human() {
    override fun sing() {
        super.sing()
        println("라라라")
        println("My name is: ${name}")
    }
}

//fun main(){
//    val human = Human("John")
//    val stranger = Human()
//
//    human.eatingCake()
//
//    val mom = Human("Monica", 52)
//    println("This human's name is ${stranger.name}")
//}
fun main() {
    val korean = Korean()
    korean.sing()
}
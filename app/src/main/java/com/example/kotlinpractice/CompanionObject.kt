package com.example.kotlinpractice

class Book private constructor(val id: Int, val name: String){
    companion object BookFactory : IdProvider{
        override fun getId(): Int {
            return 444
        }
        val myBook = "new book"
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}
fun main() {
    val book = Book.create() //create로 책 생성
    val bookId = Book.BookFactory.getId()//오브젝트 이름은 생략가능
    println("${bookId} ${book.name}")
}

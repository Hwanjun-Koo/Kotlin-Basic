package com.example.kotlinpractice


data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy()
class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main() {
    val ticketA = Ticket("대한항공", "구환준", "2023-10-12", 18)
    val ticketB = TicketNormal("대한항공", "구환준", "2023-10-12", 18)

    println(ticketA)
    println(ticketB)
}
package com.example.kotlin.functions.defaultFunction

fun main(args: Array<String>) {
    val volume = findVolume(2, 5)
    println("Volume = $volume")

    val volume1 = findVolume(2, 5,0)
    println("Volume1 = $volume1")

    println("5>0: ${5.isGreaterThan()}")
    println("5>6: ${5.isGreaterThan(6)}")
}

fun findVolume(length: Int, breadth: Int,height : Int = 10) : Int{

    return length*breadth*height
}


fun Int.isGreaterThan(anotherNumber:Int = 0):Boolean {
    return this>anotherNumber
}

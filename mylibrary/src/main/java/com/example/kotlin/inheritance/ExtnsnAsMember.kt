package com.example.kotlin.inheritance

open class CareGiver(val name : String){

    open fun Feline.react()= "PURRRR!!!" //extension function of Feline class

    fun  Primate.react() = "*$name plays with ${this@CareGiver.name}*" //extension function of Feline class

    fun takeCare(feline: Feline) {
        println("Feline reacts: ${feline.react()}")
    }

    fun takeCare(primate: Primate){
        println("Primate reacts: ${primate.react()}")
    }
}
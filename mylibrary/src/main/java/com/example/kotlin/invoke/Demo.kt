package com.example.kotlin.invoke

/** A function that takes 1 argument. */

public interface Function1<in P1, out R> : Function<R> {
    /** Invokes the function with the specified argument. */
    public operator fun invoke(p1: P1): R
}

enum class WolfActions{
    SLEEP,WALK,BITE
}

class Wolf(val name : String){
    fun myFun(action : WolfActions) = when(action){
        WolfActions.SLEEP -> "$name is sleeping"
        WolfActions.WALK -> "$name is walking"
        WolfActions.BITE -> "$name is biting"
    }
}

fun main(args: Array<String>) {
    val talbot = Wolf("Wolf ")
    talbot.myFun(WolfActions.SLEEP) // talbot.myFun(WolfActions.SLEEP)
    println("WolfActions.BITE = ${talbot.myFun(WolfActions.BITE)}")
    println("WolfActions.BITE = ${talbot.myFun(WolfActions.SLEEP)}")
}
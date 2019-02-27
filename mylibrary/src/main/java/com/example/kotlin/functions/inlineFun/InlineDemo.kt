package com.example.kotlin.functions.inlineFun

fun <T> time(body : () -> T): Pair<() -> T, Long> {
    val startTime = System.nanoTime()
    val v = body;
    val endTime = System.nanoTime()
    return v to endTime - startTime
}

/*fun main(args: Array<String>) {
    val (_,time) = time { Thread.sleep(1000) }
    println("time = $time")
}*/

//Once compiled, it will look like this:
/*
val (_, time) = time(object : Function0<Unit> {
    override fun invoke() {
        Thread.sleep(1000)
    }
})*/

/*If performance is a priority for you (mission critical application, games, video streaming), you can
mark a high-order function as inline:*/

inline fun <T> inTime(body: () -> T): Pair<T,Long>{
    val startTime = System.nanoTime()
    val v = body()
    val endTime = System.nanoTime()
    return v to endTime-startTime
}
fun main(args: Array<String>) {
    val (_, inTime) = inTime { Thread.sleep(1000) }
    println("inTime = $inTime")
}

//Once compiled, it will look like this:
/*
val startTime = System.nanoTime()
val v = Thread.sleep(1000)
val endTime = System.nanoTime()
val (_, inTime) = (v to endTime - startTime)*/

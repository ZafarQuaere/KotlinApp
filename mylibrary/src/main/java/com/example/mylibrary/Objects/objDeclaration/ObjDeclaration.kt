package com.example.mylibrary.Objects.objDeclaration

import com.example.mylibrary.classes.Cupcake

//When object has a specific name is called Object declaration
object Oven {
    fun process(product: Cupcake) {
        println(product.bake())
    }
}
fun main(args: Array<String>) {
    val myAlmondCupcake = Cupcake("Almond")
    Oven.process(myAlmondCupcake)
}
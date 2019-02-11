package com.example.mylibrary.Generics

import com.example.mylibrary.interfaces.Bakeable

interface Oven :Machine<Bakeable>{
    override fun process(product: Bakeable)
}

// Oven is machine so we can have it like..
interface Machine<T> {
    fun process(product: T)
}
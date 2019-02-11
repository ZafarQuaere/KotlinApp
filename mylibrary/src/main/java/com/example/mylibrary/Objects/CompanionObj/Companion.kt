package com.example.mylibrary.Objects.CompanionObj

import com.example.mylibrary.interfaces.Bakeable
import com.example.mylibrary.classes.abstract_class.BakerGood

class Cupcake(flavour: String) : BakerGood(flavour), Bakeable {
    override fun bake(): Any? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun name(): String {
        return "cupcake"
    }
    //an object inside a class or interface is called..
    companion object {
        fun almond(): Cupcake {
            return Cupcake("almond")
        }
        fun cheese(): Cupcake {
            return Cupcake("cheese")
        }
    }
}
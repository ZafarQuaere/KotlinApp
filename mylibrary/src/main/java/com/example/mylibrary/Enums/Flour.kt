package com.example.mylibrary.Enums

enum class Flour : Exotic {
    /* WHEAT,CORN,CASSAVA*/

    WHEAT {
        override fun isGlutenFree() : Boolean{
            return true
        }
        override fun isExotic(): Boolean {
            return false
        }
    },

    CORN {
        override fun isGlutenFree() : Boolean{
            return true
        }
        override fun isExotic(): Boolean {
            return true
        }
    },

    CASSAVA {
        override fun isGlutenFree() : Boolean{
            return true
        }
        override fun isExotic(): Boolean {
            return false
        }
    };


    abstract fun isGlutenFree(): Boolean


}
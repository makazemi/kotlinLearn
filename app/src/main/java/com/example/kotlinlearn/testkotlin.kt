package com.example.kotlinlearn

import android.os.Parcel
import android.os.Parcelable

class TestClass{

    fun testing(){
        var person=People()
       // print(person.b)
    }
}

open class People{

    private val a=1
    protected val b=2 // this accessible only in subclass
    internal val c=3 // this is accessible in same module
    //By module in Kotlin, we mean a group of files that are compiled together.
    //Internal Modifiers is useful when you need to hide specific library implementations from the users.
    //This wasn’t possible using the package-private visibility in Java.
    val d=10 // public by default

}

class Indian:People(){

    // a is not visible
    //b , c , d are visible

    fun test(){
        print(b)
        print(c)
        print(d)
       // print(a) is not visible
    }
}
// #8.8 abstract class,method,property
abstract class Test{ //  you cannot create instance of abstract class
    abstract var name:String
    abstract fun eat() // abstract properties are "open" by default
    open fun getHeight(){} // A "open" function ready to be overridden
    fun goToSchool(){}    // a Normal function: public and final by default
}

class SubTest :Test() {
    override var name: String="dummy_indian_name"

    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

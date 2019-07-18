package com.example.kotlinlearn

// #8.9 interface
interface MyInterfaceListener{
    var name:String // Properties in interface are abstract by default

    fun onTouch() // methods in interface are abstract by default

    fun onClick(){ // Normal Methods are public and open by default NOT FINAL
        // Your code
    }
}

class MyButton : MyInterfaceListener{

    override var name:String="dummy_name"

    override fun onTouch() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
// #8.10 data class

fun main(args:Array<String>){
    var user1=User("sam",10)
    var user2=User("sam",10)

    println(user1.toString())

    // if don't declare data class this object compare refrences and
    // the result is not equal
    //but when use data class two class compare of them data
    // and the result is equal
    if(user1==user2)
        println("Equal")
    else
        println("Not Equal")

    var newUser1=user1.copy() // we can copy the opbjec
    var newUser2=user1.copy(name="peter")// we can copy and override its property

    println(newUser1)
}
data class User(var name:String,var id:Int){


}
// #8.11 object declaration alternative to static
fun testObject(){
    CustomersData.count=98
    CustomersData.typeOfCustomer()

    println(CustomersData.count)
    CustomersData.count=109

    println(CustomersData.count)

    MyClass.count

}
open class MySuperClass{

    open fun myMethod(str:String){
        println("MySuperClass")
    }
}
/*
objects cannot have constructors
as we cannot create object/instance manually
object can also have super class
 */
object CustomersData : MySuperClass(){
    var count:Int=-1 // Behaves like STATIC variable

    fun typeOfCustomer(): String{ // Behaves like STATIC methods
        return "Indian"
    }

}
// 8.12 companion object
// act like object but in the within a class
// act like static in java
class MyClass{

    companion object {
        var count:Int=-1 // Behaves like STATIC variable

        fun typeOfCustomer(): String{ // Behaves like STATIC methods
            return "Indian"
        }
    }
}
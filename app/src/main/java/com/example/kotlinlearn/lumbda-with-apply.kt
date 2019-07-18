package com.example.kotlinlearn

import android.media.tv.TvContract

// #9.1
/*
High Level Functions
* can accept functions as parameters
* can return a function
* or can do both
Lambdas
* it is just a function with no name
 */

fun main(args:Array<String>){

    val program=Program()

    program.addTwoNumbers(2,9)
    program.addTwoNumbers(2,9,object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })

    val myLambda:(Int) -> Unit = { s :Int -> println(s)} // lambda expression [function]

    // these three line are the same
    program.addTwoNumbers(2,9,myLambda)
    program.addTwoNumbers(2,9,{ s -> println(s)})
    program.addTwoNumbers(2,9) { s -> println(s)}


    /*
    #9.3
        in java 8, you cannot mutate values of outside variable inside lambdas
        but in kotlin you can change the values
     */
    var result=0
    program.addTwoNumbers(2,9) {x,y -> result= x +y}
    print(result)

    /*
        #9.4 it keyword in lambda
        it: Implicit name of single parameter
     */
    program.reverseAndDisplay("hello",{it.reversed()})

    /*
        #9.5 WITH and APPLY
        with and apply do same thing
        only apply can run the method of class
     */
    with(program){
        name="maryam"
        age=24
    }

    program.apply {
        name="maryam"
        age=24
    }.startRun()

}
class Program{

    var name:String=""
    var age:Int=-1


    fun reverseAndDisplay(str:String,myFunc:(String) -> String ){
        var result=myFunc(str)
        println(result)
    }

    fun addTwoNumbers(a:Int,b:Int,action:(Int,Int)-> Unit){
        action(a,b)
    }


    // High Level Function with lambda as Parameter
    fun addTwoNumbers(a:Int,b:Int,action:(Int)-> Unit){
        val sum=a+b
        action(sum)

    }

    // Using Interface/ Object Oriented way
    fun addTwoNumbers(a:Int,b:Int,action:MyInterface){
        val sum=a+b
        action.execute(sum)
    }

    // Simple way .. Just for better understanding
    fun addTwoNumbers(a:Int,b:Int){
        val sum=a+b
        println(sum)
    }

    fun startRun(){
        println("Now I am ready to run")
    }

}

interface MyInterface{
    fun execute(sum:Int)
}
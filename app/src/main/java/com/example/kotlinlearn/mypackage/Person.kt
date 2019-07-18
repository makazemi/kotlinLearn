package com.example.kotlinlearn.mypackage

class Person(var name: String) {

    // var name:String="dummy" second way to define
    // property for person class

    var id:Int=-1
    init{
        // this.name=name
    }
    fun display(){
        print("the name of person is ${name}")
    }

    constructor(name:String,id:Int):this(name){
        //The body of the Secondary constructor is clled after the init block
        this.id=id
    }
}
// 8.4 Inheritance in kotlin
/*
by default class are public final
for enable inheritance from a class
should declare it open
 */
open class Animal{
    open var color:String="black"
    // we use open keyword to we could
    // override eat() method in child class
    open fun eat(){
        println("animal is eating")
    }

    constructor(color:String){
        this.color=color
        println("From Animal: $color")
    }
}
class Dog:Animal{

    var breed:String=""
    override var color:String="white"
    fun bark(){
        println("Bark")
    }

    override fun eat() {
      println("Dog is eating")
    }

    constructor(color: String,breed:String):super(color){
        this.breed==breed
        println("From Dog: $color and $breed")
    }
}
class Cat:Animal{
    var age:Int=-1
    fun meow(){
        println("Meow")
    }
    override fun eat() {
        println("Cat is eating")
    }

    constructor(color: String,age:Int):super(color){
        this.age==age
        println("From Dog: $color and $age")
    }
}
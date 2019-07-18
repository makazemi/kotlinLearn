package com.example.kotlinlearn

// #3.3
fun main(args: Array<String>){

    var personObj=Person()
    personObj.name="steve"


    //output of these line is the same
    personObj.display(personObj.name)
    personObj.display()
}

class Person{
    var name:String=""
    var age:Int=-1


    fun display(name: String){
        print(name)
    }

    fun display(){
        print(name)
    }






}
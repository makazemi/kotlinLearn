package com.example.kotlinlearn

import java.math.BigInteger

//public static void main(String[] args){
//
//}
fun main(arg: Array<String>): Unit{

    var myString="Hello world"
    var myDecimal=1.0
    var myNumber=10 // kotlin itself determain type of variable

    var varString :String //Mutable String
    varString="Hello world"
    varString="Another String"

    val constantString="My constant string"// Immutable string

    // output of these line is the same
    println("the number is : "+myNumber)
    println("the number is : ${myNumber}")



}
// #4.5
fun  range(){

    //this range contains the number 1,2,3,4,5
    val r1=1..5
    val moveUp=1.rangeTo(5)

    //this range contains the number 5,4,3,2,1
    val r2=5 downTo 1
    val countDown=5.downTo(1)

    //this range contains the number 5,3,1
    val r3= 5 downTo 1 step 2

    //this range contains the values from "a", "b", ... , "z"
    val r4='a'.. 'z'

    var isPresent='c' in r4

}

//#5.1
fun ifExpression(){

    val a=2
    val b=5
    var maxValue:Int=if (a>b)
        a
    else
        b

    println(maxValue) // print 5
}
//#5.2 when in kotlin as switch case in java
fun whenExpression(){
    val x=100


    when(x){
        1 -> {
            "x is 1"
        }
        2 -> {
            "x is 2"
        }
        in 3..20->{
            "x lies in 1 to 20"
        }
        else -> {
            "x value is unknown"
            "x is an alien"
        }
    }


    var str:String=when(x){
        1 -> {
            "x is 1"
        }
        2 -> {
            "x is 2"
        }
        in 3..20->{
            "x lies in 1 to 20"
        }
        else -> {
            // last statement retrun
            "x value is unknown"
            "x is an alien"
        }
    }

    print(str)
}
// 6.1  loop
fun loop(){
    for (i in 1..4){
        println("Hello")
    }

    var i:Int=1
    while (i<5){
        println("Hello")
        i++
    }

    do{
        println("Hello")
        i++
    }while (i<5)

    //break
    for(i in 1..10){
        println(i)
        if(i==5) {
            break
            // break lead to terminate for loop
        }
    }

    // break always exist from inner loop but if use myLoop@ annotation
    // break exist form outer loop
    myLoop@for (i in 1..3){
        for(j in 1..3){
            println("$i $j")
            if(i==2 && j==2)
                break@myLoop
        }
    }

    // continue
    for (i in 1..10){
        if(i%2==0){
            // this loop only print odd number
            // continue lead to for loop go first loop and skip continue of instructions
            continue
        }

        println(i)
    }

    // default continue apply for inner loop
    // but when use this annotation it apply for
    // outer loop
    myLoop@for (i in 1..3){
        for(j in 1..3){
            println("$i $j")
            if(i==2 && j==2)
                continue@myLoop
        }
    }

}
// #7.1 function

fun add(a:Int,b:Int):Int{

    var sum=a+b
    return sum
}
// #7.2 functions as expression. one line functions

fun max(a:Int,b:Int):Int=
        if(a>b){
            println("$a is greater")
            a
        }else{
            println("$b is greater")
            b
        }
// #7.4 kotlin java interoperability
fun show(){
    var area=MyJavaFile.getArea(5,9)
}
fun addTwoNumber(a:Int,b:Int):Int{
    return a+b
}
// #7.5 function with d efault parameter
@JvmOverloads // we know java don't support default function
//with using this annotation we can use this function in java
//class and don't pass default value
fun findVolume(length:Int,breadth:Int,height:Int =10):Int{
    return length*breadth*height
}
// #7.7 extension functions
// we can define a function for a own class
//or a non own class like String, Int ,...
fun showExtensionFun(){
    val str1:String="Hello"
    val str2:String="World"
    var str3:String="Hey"
    str3.add(str1,str2)

    val x:Int=6
    val y:Int=10

    val greaterVal= x greaterValue y // equevalent  x.greaterValue(y)

}
fun String.add(s1:String,s2:String):String{
    return this+s1+s2
}
// #7.8 infix function
/*
1. All Infix functions are extension function
But all extension function are not Infix
2. INFIX functions just have ONE parameter
 */
infix fun Int.greaterValue(other:Int):Int{
    if(this>other)
        return this
    else
        return other
}
// #7.9 tailRec function
/*
with tailrec keyword in the before of the fun keyword
kotlin prevent stackoverflow error in recursive function
 */
tailrec fun getFibonacciNumber(n:Int,a:BigInteger,b:BigInteger):BigInteger{

    if ( n==0 )
        return b
    else
        return getFibonacciNumber(n-1,a+b,a)
}
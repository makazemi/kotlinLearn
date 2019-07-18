package com.example.kotlinlearn


fun main(args:Array<String>){

    /*
        10.1
        Array
     */
// Elements: 0  0   0   0   0
// Index     0  1   2   3   4
    var myArray=Array<Int>(5){0} // Mutable.Fixed size

    myArray[0]=32
    myArray[3]=45

    for(element in myArray){
        println(element)
    }

    for (index in 0..myArray.size-1){
        println(myArray[index])
    }

    /*
        10.2
        list
     */
    var list= listOf<String>("ali","ahmad","hossein") // Immutable, Fixed Size,Read Only
    var mutableList= mutableListOf<String>() // Mutable,No Fixed Size,Can Add or Remove Element
    var arraylistof= arrayListOf<String>() // Mutable,No Fixed Size,Can Add or Remove Element
    var arraylist= ArrayList<String>() // Mutable,No Fixed Size,Can Add or Remove Element

    mutableList.add("ali")
    mutableList.add("ahmmad")
    mutableList.add("maryam")


    for(element in list){
        println(element)
    }

    for (index in 0..list.size-1){
        println(list[index]) // OR list.get(index)
    }

    /*
        10.3 Map Tutorial : key-value Pair
     */
    var myMap= mapOf<Int,String>(4 to "ali", 32 to "mohamad", 22 to "alireza") // Immutable,Fixed Size,Read Only
    var hashMap= HashMap<Int,String>() // Mutable,No Fixed Size,Read and Write both
    var mutableMapOf= mutableMapOf<Int,String>() // Mutable,No Fixed Size,Read and Write both // LinkedHashMap
    var hashMapOf= hashMapOf<Int,String>() // Mutable,No Fixed Size,Read and Write both


    hashMap.put(4,"ali")
    hashMap.put(49,"hasaN")
    hashMap.put(4,"marya")
    hashMap[3]="ks"

    for (key in myMap.keys){
        println(myMap[key]) //Or myMap.get[key ]
    }

    /*
        10.4 set

     */

    // "Set" contains unique elements
    // HashSet" also contains unique elements but Sequence is not guaranteed in output

    var mySet= setOf<Int>(2,34,55,3,56,9,9,9,8) // Immutable.READ ONLY
    var mutableSetOf= mutableSetOf<Int>(2,34,55,3,56,9,9,9,8) // Mutable Set.READ and WRITE both
    var hashSetOf= hashSetOf<Int>(2,34,55,3,56,9,9,9,8) // Mutable Set.READ and WRITE both

    mutableSetOf.add(43)
    mutableSetOf.remove(3)

    for (element in mySet){
        println(element)
    }

    /*
        11.1 filter and map
     */

    val myNumbers= listOf(2,3,5,6,44,77)
    val mySmallNum: List<Int> =myNumbers.filter { v -> v<10 } // OR it < 10

    for (num in mySmallNum){
        println(num)
    }


    val mySquareNum: List<Int> =myNumbers.map{ num -> num*num} // OR it*it

    for (num in mySquareNum){
        println(num)
    }

    val mySmallSquaredNum=myNumbers.filter { it<10 }.map { it*it }

    for (num in mySmallSquaredNum){
        println(num)
    }

    var people= listOf<Personj>(Personj(10,"Sriyank"),
        Personj(10,"Annie"),Personj(10,"Sam"))

    var names=people.filter { person-> person.name.startsWith("S") }
                    .map { it.name }

    for (name in names){
        println(name)
    }

    /*
        11.2 predicates all,any,count,find
     */

    val check1=myNumbers.all  { it>10 } // Are all element greater than 10? return boolean

    val check2= myNumbers.any{ it>10} // Does any of these elements satisfy the predicate?

    val totalCount= myNumbers.count{it>10 } // Number of element that satisfy the predicate

    val num=myNumbers.find { it>10 } // Returns the first number that matches the predicate



}

class Personj( var age:Int,var name:String){



}


package com.example.kotlinlearn

fun main(args: Array<String>) {

    // WAP to find out length of name
    val name: String? = null

    // 1. Safe Call ( ?. )
    // return the length if 'name' is not null else return null
    // Use it if you don't mind getting NULL value
    println("The length of name is ${name?.length}")

    //2. Safe Call with let ( ?.let )
    //It executes the block ONLY IF name is NOT NULL
    name?.let {
        println("The length of name is ${name.length}")
    }

    //3. Elvis-operator ( ?: )
    //When we have nullable reference 'name', we can say "is name is not null" , ust it,
    // otherwise use some non-null value"

    val len = if (name != null)
        name.length
    else
        -1
    val length = name?.length ?: -1

    //4. Non-null assertion operator ( !! )
    //Use it when you are sure the value is NOT NULL
    //Throws NullPointerException if the value is found to be NULL
    print("The length of name is ${name!!.length}")

}

/*
    12.2 lateint keyword
 */
// lateint used only with mutable data type (var)
// lateint used only with non-nullable data type
// lateint values must be initialised before you use it
//Note: if you try to access lateinit variable without initializing it then it
//throws UninitializedPropertyAccessException
class Country{
    lateinit var name:String

    fun setup(){
        name="USA"
        println("The name of country is $name")
    }
}
/*
    12.3 lazy delegation
 */
// lazy initialization was designed to prevent unnecessary initialization of objects
// Your variables will not be initialized unless you use it in your code
//It is initialize only once.Next time when you use it, you get the value from cache memory.
//It is thread safe
//It is initialized in the thread where it is used for the first time.
//Other threads use the same value stored in the cache.
val pi:Float by lazy {
    3.14f
}
fun showLazy(){

    println("Some initial code.....")

    val area1=pi*4*4
    val area2=pi*9*9

    println("Some initial code.....")
}
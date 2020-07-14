fun main() {
    val a:String = "Pulkit";
    var a2:String = "Pulkit";
    val b:Int = 28;
    val c:Boolean = true;
    lateinit var late: String;
    //lateinit means late inintialization
//    a = "verma";
    a2 = "verma";
    println(a);
    println(a2);
    // in place of contcatination we are using $ sign
    println("$a is $c at $b");
    late = "myName";
    println(late);

    // IN Kotlin we cannot just assign some varible null value this is not good ;<
    // So we have to use ? whereever we are not sure whether it will get "null" value or not

    var check:String? = null;
//    var size:Int = check?.length!!
    // Here double exclamation mark     means that irrespective of the data type I'm saying that
//    my variable will never be null
    var size: Int = check?.length ?: 0;
    // Here we are using elvis operator that if the value is null then chcange the
//    value in the size to be 0
    println(check);
    println(size);
    // to use a property inside a print statement we have to use curly braces{}
    println("Size of the check is ${a.length}")


//    ******************** Kotlin Arrays **********************

    // This method works on [vararg]
    //vararg means that you can have n numbers of arguments inside any function
    val numbers = arrayOf(1, 32, 3, 4);
    var stringNmbers = arrayOf("something", "otherthing", 67);
    // you can also specify by yourself
    val anotherStringNumbers = arrayOf<String>("dfd", "anotherthing", "dnd");

    // we can also create constructor of array like

    val num = Array<Int>(size=3, init = { i -> i * 2 })

    val numArray = intArrayOf()

    println(num[2])

    // for null values of an array
    val nullarray = arrayOfNulls<String>(size=5)
    println(nullarray[4])


//    ************************** Working with collection of items ********************
//     *********************** Lists or Collections ******************


    // By default in kotlin lists are immutable

    var list = listOf<String>("something", "anotherthing", "other thing")
    var mutablelist = mutableListOf<String>("something", "anotherthing", "otherthing") // we can mutate this list but not the upper one.
    var mutablelistarray = arrayListOf<String>("something", "anotherthing", "otherthing")
    var mapofnames = mapOf<String, String>("thisthing" to "something", "thatthing" to "anotherthing")
    // Map is immutable and HashMap is mutable
    mutablelist.add("someotherthing")
    println(mutablelist)
    println(mapofnames)


    // ******************** For Each loop *************************
    // for each loop can work with any listof, it can be a array, mutable or anything

//    mutablelistarray.forEach {
//        print(it + " + ")
//    }
//    println()
//    numbers.forEach {
//        println(it)
//    }

    // ********************** Working with loops *****************

    for(name in mutablelistarray) {
        print(name)
    }

    for(x in 0..10) {
        // here 10 is inclusive
        print(x)
    }
    println()

    for(x in 0 until 10) {
        //here 10 is exclusive
        print(x)
    }
    println()

    for(x in 0 until 10 step 2) {
        print(x)
    }
    println()

    for(x in 10 downTo 0 step 2) {
        print(x)
    }
    println()


    // ************************ Special Keyword in Kotlin ***********************

    var any: Any = "anyString"
    var newany: String = any as String

    if(any is String) {
        print(newany.length)
    }

    println()


    // ***************************
    // As a replacement we use "when" in kotlin

    when (any) {
        "someString" -> {
            println("This is some string")
        }
        "anyString" -> {
            println("This is any string")
        }
        "otherString" -> {
            println("This is other string")
        }
        else -> {
            println("This is not string")
        }
    }

    // using "when" operator we can also return something

    var x = when (any) {
        "someString" -> "someString is $any"
        "anyString" -> "anotherString is $any"
        "otherString" -> "otherString is $any"
        else -> "Not a valid string"
    }
    // this above will store the value of whatever condition satisfies into variable x
    println(x)


    // ****************** Functions in  Kotlin *****************
    println(myName())
    println(add(10))
    println(add2(15))
    println(add3(20))

    /*
    Types of arguments of funcion
    1. Position Arguments
    2. Default Arguments
    3. Named Arguments
     */

    getDetails("pulkit", 20, true) // Positional Arguments
    getDetails(age = 19, name = "somename", checksum = false) // named Arguments

    // function naming should always be camel case

    // passing an array into funcion using vararg call
    varargfun(1, 2, 3, 4, 4, 5, 6, 76, 7, 4)
}

fun myName():String {
    return "returning pulkit"
}

fun add(number: Int): Int {
    return number + 10
}

fun add2(number: Int): Int = number + 15

fun add3(number: Int) = number + 20


fun getDetails(name: String, age: Int, checksum: Boolean) {
    println("His name is: $name and his age is: $age and he is: $checksum")
}

fun varargfun(vararg number: Int) {
    for(num in number) println(num)

}
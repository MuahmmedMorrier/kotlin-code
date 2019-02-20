// Single-Expression functions
// vararg
fun main(args: Array<String>) {
    //println(cube(5))
    //println(mul(4f,7.9f,2.3f))
    //println(some_Opers(x = 7f , y = 1.2f))
    println(summation(2,3))
    println(summation(2,3,4))
    println(summation(5,6,7,8,8,9,9,0,100))
}

fun cube(x : Int) = x*x*x
fun mul(x : Float , y : Float , z : Float) = x*y*z
fun some_Opers(x : Float , y : Float) = (x+y)/(x*2)+1

fun summation(vararg myInts : Int):Int{
    var count = 0
    myInts.forEach {
        count += it
    }

    return count
}
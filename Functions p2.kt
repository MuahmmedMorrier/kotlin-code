fun main(args: Array<String>) {

    //myInt(10)
    //myInt(100)
    //myInt(1000)
    //myInt(11.0f)
    myInt(10f,11f)
    //printAll(20 , 40.6f)
}

fun myInt(x: Int): Unit {
    println(x)
}

fun myInt(x: Float): Unit {
    println(x)
}
fun myInt(x:Float , y : Float){
    println(x)
    println(y)
}

fun printAll(x: Int, y: Float): Unit {
    println(x)
    println(y)
}
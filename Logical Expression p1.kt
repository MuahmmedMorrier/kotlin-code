fun main(args: Array<String>) {

    println("Enter two Integers ")
    val input1 = readLine()!!.toInt()
    val input2 = readLine()!!.toInt()
    val input3 = readLine()!!.toInt()

    if ( (input1 <= 3) && ((input2 == 5) && (input3 >= 7) )){ // 2  5 10
        println("if is true")
    }
    // and  &&
    //  false false    false
    // true false       false
    // true true        true
}
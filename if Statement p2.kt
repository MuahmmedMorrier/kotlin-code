fun main(args: Array<String>) {

   // or ||
    // false false      false
    // true   false      true
    // true  true          true
    var input1 = readLine()!!.toFloat()
    var input2 = readLine()!!.toFloat()

    if( (input1 == 9f) || (input2 >= 4f)){
        println("if is true")
        println("End of if")
    }
    // not !
    // false   true
    // true      false
    if (!(input1 == 5f)){
        println("input1  = 5")
    }

}
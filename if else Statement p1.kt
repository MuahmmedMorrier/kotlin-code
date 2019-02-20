fun main(args: Array<String>) {


    val input1 = readLine()!!.toDouble()
    val input2 = readLine()!!.toDouble()
    var x:Int = 100
    if( input1 >= input2+300.0){
        println("if is true")
        x = 300
        println("end of if")
    }else{
        println("if is false so else excuted")
        x = 500
        println("end of else")
    }
    println(x)
}
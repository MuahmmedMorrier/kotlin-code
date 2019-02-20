fun main(args: Array<String>) {

    var input = readLine()!!.toInt()

    when(input){
        3 -> {
            println("Hello ")
            println("Welcome ")

        }
        2 -> {
            println(2)
            println("second iteration")

        }
        10,20 -> println("input decade")
        100, 200 ,300 -> println(input.toString() + " bigger number ")

        in 500 .. 600 -> {
            println("your input from 500 to 600 ")
            println("last iteration")
        }
    }
}
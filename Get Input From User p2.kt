fun main(args: Array<String>) {
    println("Enter three numbers")
    var x = readLine()!!.toInt()
    var y = readLine()!!.toInt()
    var z = readLine()!!.toInt()

    println("Add ${x+y+z}")
    println("Sub ${x-y-z}")
    println("Mul ${x*y*z}")
    println("Div ${x/(y*z)}") // 100 / (21) = 4 and fractions
    println("Modulus ${x % (y*z) }") // 3 / (5*7)   = 3/35 // 3
}
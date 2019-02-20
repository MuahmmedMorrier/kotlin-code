fun main(args: Array<String>) {
    // Float   Double
    var myfloat1 : Float = 5.8f
    var myfloat2 = 22.2f
    var result1 = myfloat1 + myfloat2
    println(result1)

    val mydouble1 : Double = 2000.2
    val mydouble2 = 1000.8
    println(mydouble1+mydouble2)

    val myfloat = Float.MAX_VALUE
    println(myfloat)// 3.4 * 10^38
    val mydouble = Double.MAX_VALUE
    println(mydouble) // 1.7 * 10^308

    val myfloatt = Float.MIN_VALUE
    println(myfloatt)// 3.4 * 10^-45
    val mydoublee = Double.MIN_VALUE
    println(mydoublee) // 4.9 * 10^324
}
fun main(args: Array<String>) {

    var x : Int = myReturn()
    var output :Boolean = false
    println(x)
    output =isPrime(20)
    println(output)
    output = isPrime(11)
    println(output)
    output =isPrime(13)
    println(output)
}

fun myReturn():Int{
    println("Hello in myReturn")
    return 20
}
// 2 3 5 7 11 13 17 19 ...  // 5 2 3   except prime and number greater than 5
fun isPrime(x: Int): Boolean {
    if(x > 5){
        if ( x%2 != 0 &&  x%3 != 0 &&  x%5 != 0 ){
            return true
        }
    }else if (x == 5 || x == 3 || x == 2){
        return true
    }
    return false
}
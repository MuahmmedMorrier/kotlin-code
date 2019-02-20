//Local Function
fun main(args: Array<String>) {
    println("Enter Intger number")
    var num = readLine()!!.toInt()
    isPrime(num)

}
fun isPrime(num : Int){
    fun prime() :Boolean{
        // 2 3 5  7  11  13  17 19
        // 2 3 5
        if ( num > 5){
            if( num % 2 != 0 && num % 3 !=0 && num % 5 != 0 ){
                return true
            }
        }else if( num == 2 || num  == 3 || num == 5) {
            return true
        }
        return false


    }
    var x = prime()
    if(x == true){
        println(num)
    }

}
// 0  1
// 1    fib for 1
// 2    fibr for 2
// 3
// 5
// 8        fib for 5
// 13       fib for 6
fun main(args: Array<String>) {
    println(fibway1(5))
    println(fibway1(6))
    println(fibway1(7))
}

fun fibway1(x : Int):Int{
    var counter :Int = 0
    var endcounter : Int = x

    fun fib(x1: Int , y1 :Int = 0) :Int{
        if(y1 == 0){
            counter += 1
            return fib(1,1)
        }
        if(counter < endcounter){
            counter +=1
            return fib(x1+y1 , x1)
        }else if( counter == endcounter){
            return x1
        }
        return x1
    }

    return fib(x)
}
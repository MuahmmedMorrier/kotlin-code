// Default Arguments
fun main(args: Array<String>) {
    //println(calc_Fact())
    //println(calc_Fact(4)) // 24 =  4
    println(mul_3paramters(x =3 ,z = 5)) // 15*2 = 30
}

// 4 =   4*3*2*1
// 5 = 5*4*3*2*1

fun calc_Fact(x : Int = 5):Int{
    var count = 1
    if(x > 1){

        for ( i in  1 .. x){
            count *= i //  =count * i
        }
        return count
    }else{
        return 1
    }
}
fun mul_3paramters(x:Int , y : Int = 2 , z:Int = 3):Int{
    return x*y*z
}
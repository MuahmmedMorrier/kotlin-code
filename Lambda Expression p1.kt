fun main(args: Array<String>) {
    println(lambda(10,8))
    println(lambda2(10.4f,12.5f,1.2f))
    println(fact(5))
    println(fact(4)) // 4*3*2*1 = 24
}

var lambda = {
    x:Int, y : Int  -> (x+y)/2
}
var lambda2 = {
    x : Float , y : Float , z: Float -> (x+y+z)/3
}
// 4 =  4*3*2*1
// 5 = 5*4*3*2*1
var fact = {
    x:Int ->
    if(x == 0 || x==1)
        1
    else{
        var result :Int = 1
        for ( i in 1 .. x){
            result *= i
        }
        result
    }
}
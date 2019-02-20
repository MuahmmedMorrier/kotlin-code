fun main(args: Array<String>) {

    for( i in 5 downTo 0){
        println(i)
    }
    println("=====================second  loop ")
    for ( i :Int in 7 downTo 0 step 3){
        print(i.toString() + " ")
        if ( i == 7 ){
            println("first iteration in loop ")
        }

        if ( i <= 5){ // 4  // 1   1 and 4
            println("i is small number")
        }
    }
    println("======Third loop")
    for(i in 5 downTo 1){ // 5 4 3 2 1
        println(i*i)
        println(i*i*i)
    }
}
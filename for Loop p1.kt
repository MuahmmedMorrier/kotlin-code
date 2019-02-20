fun main(args: Array<String>) {

    for( i in 1 .. 9){

        print(i.toString()+" ")
        //println()
    }
    println()
    println("============== second loop")
    for (i in 1 .. 9 step 2){ // 1 3 5 7 9
        print(i.toString()+" ")
        //println()
    }
    println()
    println(" ================== third loop")
    for ( i in 1 until 15){
        print(i.toString()+" ")
        //println()
        if (i == 7){
            println("Hello ")
        }
        if( i == 10){
            println("i  is equal to 10")
        }
    }
}
fun main(args: Array<String>) {
    /*for (i in 1 .. 5){
        println(i)
        if (i == 3){
            break
        }
        println("end the loop")
    }*/
    myloop@ for(i  in 1 .. 5){
       for ( n in 50 .. 55){
           if (i == 4 && n == 53){ // i == 4
               break@myloop
           }
           println("i $i : n $n")
       }
    }

}


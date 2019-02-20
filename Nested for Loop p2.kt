fun main(args: Array<String>) {

   for ( i in 1 .. 5){ // outer
       println("outer ")
       for ( c in 1 .. 3){ // second level for loop
           print(c.toString()+" ")
           for (v in 1 .. 3){
               print("inner ")
               if ( v == 3 && c == 3 && i == 5){
                   println("Finsih")
               }
           }
       }
       println()

   }
}
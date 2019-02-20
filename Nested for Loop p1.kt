fun main(args: Array<String>) {

   for ( i in 1 .. 5){ // outer
       println(i)
       for ( x in  100 .. 104){ // inner for loop
           print(x.toString()+" ")
           for (c in 1000 .. 1004){// 1 2 3 4 5
               print(c)
           }
       }
   }
}
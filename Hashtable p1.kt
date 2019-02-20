import java.util.*

//Hashtable
fun main(args: Array<String>) {
    var myhasht = Hashtable<Int , Int>()
    myhasht.put(3,3000)
    myhasht.put(1 , 1000)
    myhasht.put(100,2000)

    myhasht.putAll(mapOf(0 to 5000 , 600 to 6000 ,4 to 4000  ))
    myhasht.forEach { t, u ->
        println("key : $t  , value : $u")
    }
}
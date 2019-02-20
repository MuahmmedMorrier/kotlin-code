import java.util.*

//Hashtable
fun main(args: Array<String>) {
    var myhashtable = Hashtable<Int , String>()
    myhashtable.put(1, "ABC")
    myhashtable.put(2, "ASD")
    myhashtable.put(3, "FGH")
    /*myhashtable.forEach { t, u ->
        println("key :$t  value : $u")
    }
    myhashtable.replaceAll { t, u ->
        when(t) {
            1 -> "Ahmed"
            2 -> "Mohammed"
            3 -> "Jousef"
            else -> "A"
        }
    }
    */
    ///myhashtable[2] = "Ahmed"
    myhashtable.set(2 , "Ahmed")
    //myhashtable.clear()
    println("all Elements after clear")
    myhashtable.forEach { t, u ->
        println("key :$t  value : $u")
    }
}
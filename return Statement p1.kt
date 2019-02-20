fun main(args: Array<String>) {
    /*var array = arrayOf(25,6,7,8,88,2)
    array.forEach label@{
        if(it == 88 ){
            return@label
        }
        println(it)
    }*/
    println(testFunc())

}

fun testFunc():Int{
    var array = arrayOf(25,6,7,8,88,2)
    array.forEach label@ {
        if (it == 88) {
            return 25
        }
        println(it)
    }
    return 0
}




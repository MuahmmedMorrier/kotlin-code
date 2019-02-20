fun main(args: Array<String>) {
    /*var list = mutableListOf<Int>(1,2,3)
    var modlist = list.map { it*3 }
    list.forEach {
        println(it)
    }
    println("After making map")
    modlist.forEach {
        println(it)
    }*/
    println("Enter First number")
    val start = readLine()!!.toInt()
    println("Enter the last number")
    val end = readLine()!!.toInt()
    println("Enter Step ")
    val vstep = readLine()!!.toInt()
    var myarrlist = ArrayList<Int>()

    for (i in start .. end step vstep){
        myarrlist.add(i)
    }
    var modifiedlist = myarrlist.map { it*it*it }
    modifiedlist.forEach {
        println(it)
    }
}
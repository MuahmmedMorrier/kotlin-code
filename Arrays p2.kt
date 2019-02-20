fun main(args: Array<String>) {
    val strs = arrayOf("School","Univertsit","Hotel","Class")
    strs.forEach {
        println(it)
        println(strs.indexOf(it)) }
    println(strs.size)
    //strs[4] = "Hotel"
    println(strs.lastIndex)
    println(strs.get(2))

}

fun main(args: Array<String>) {
    var i :Int = 5
    //println(i::class)
    //println(i::class.java)
    //println(i::class.qualifiedName)
    //println(i::class.simpleName)

    val app1 = App(5)
    var cons = app1::class.constructors
    cons.forEach {
        println(it)
    }

}

class App{
    var x : String? = null
    constructor(x : Int)
    constructor(y : String)
    fun printInfo(){

    }
    fun print_Info():Int{
        return 5
    }
}
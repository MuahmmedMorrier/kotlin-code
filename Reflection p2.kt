fun main(args: Array<String>) {
    var i :Int = 5
    //println(i::class)
    //println(i::class.java)
    //println(i::class.qualifiedName)
    //println(i::class.simpleName)

    val app1 = App(5)
    val emp1 = Employee("Ahmed", 7000)
    val y = app1::class.isSealed
    println(y)
    //var cons = app1::class.isInstance(App(5))
    //println(cons)

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
data class Employee(val vname : String , val vsalary : Int)
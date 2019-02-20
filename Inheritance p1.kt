
open class Employee{
    var name:String? = null
    var address:String? = null
    var salary:String? = null
    open fun print_Address(): Unit {
        println(this.address)
    }
    fun rem_Taxes(sal : Int){
        if (sal>10000){
            println(sal- 500)
        }
    }
}

class Student: Employee(){
    override fun print_Address() {
        super.print_Address()
        super.rem_Taxes(14000)
    }
}

fun main(args: Array<String>) {
    val s1 = Student()
    s1.address = "Egypt"
    s1.rem_Taxes(11000)
    println("====================")
    s1.print_Address()
}
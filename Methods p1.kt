//Methods
fun main(args: Array<String>) {
    var c1 = Car()
    c1.set_All()
    c1.print_All()
    c1.put_directly(600 , "Toyota")
}
class Car(){
    var speed :Int? = null
    var type : String? = null
    fun set_All(){
        println("Enter the speed of the car")
        speed = readLine()!!.toInt()
        println("Enter type of the car")
        type = readLine()!!.toString()
    }
    fun print_All(){
        println("speed :${this.speed}")
        println("type  : ${this.type}")
    }
    fun put_directly(vspeed : Int , vtype : String){
        speed = vspeed
        type = vtype
        println("put directly method")
        println("speed :${this.speed}")
        println("type  : ${this.type}")
    }
}
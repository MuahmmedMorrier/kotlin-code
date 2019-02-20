import java.util.ArrayList

// ArrayList

fun main(args: Array<String>) {
    var arvehicle = ArrayList<Vehicle>()
    var y = Vehicle(300 , "Benz")
    arvehicle.add(y)
    arvehicle.add(Vehicle(400, "Toyota"))
    arvehicle.add(Vehicle(500 , "GMC"))
    /*arvehicle.removeIf {
        it.type == "GMC"
    }
    arvehicle.removeAt(0)
    arvehicle.forEach {
        println(it.type)
    }
    arvehicle.clear()
    arvehicle.add(Vehicle(200,"Any"))
    arvehicle.forEach {
        println(it)
    }
    */
    var x = arvehicle.contains(y)
    println(x)
}
class Vehicle(private val vspeed :Int , private val vtype : String ){
    var speed = vspeed
    var type = vtype
}
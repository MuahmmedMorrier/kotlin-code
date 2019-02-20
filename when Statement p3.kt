fun main(args: Array<String>) {

    var salary : Int
    println("Enter your Id")
    var employeeId = readLine()!!.toInt()

    salary = when(employeeId){
        1 -> 10000
        2 -> 8000
        in 3..10 -> {
            if (employeeId == 5){
                4000
            }else{
                4200
            }
        }
        11,12,14,15 -> 2000
        else -> {
            if(employeeId == 100){
                1100
            }else{
                1150
            }
        }
    }
    println(salary)
}
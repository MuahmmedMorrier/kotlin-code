fun main(args: Array<String>) {


   var salary = readLine()!!.toInt()
    var taxes : Int

    if(salary >= 10000){
        taxes = 500
        salary -= taxes // salary = salary - 500  = 10000 -500 = 9500
    }else if ( salary >= 8000 && salary < 10000){
        taxes = 400
        salary -= taxes
    }else if( salary >=  6000 && salary < 8000){
        taxes = 300
        salary -= taxes
    }else {
        taxes = 200
        salary -= taxes
    }
    println(salary)
}
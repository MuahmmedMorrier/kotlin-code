// Enum Class
fun main(args: Array<String>) {
    //println(AppleCompany.Iphone5)
    //println(AppleCompany.Iphone5s)
    println(AppleComp.Iphone5.price)
    println(AppleComp.Iphone5s.year)
    AppleComp.Iphone5.printInfo()
    AppleComp.Iphone5s.printInfo()
}

enum class AppleCompany{
    Iphone5 , Iphone5s, Iphone6,Iphone6s
}

enum class AppleComp(val year : Int , val price :Float){
    Iphone5(2017, 10000f) , Iphone5s(2016 , 11000f);
    fun printInfo(){
        when(this){
            Iphone5s -> println("this is iphone 5s")
            Iphone5 -> println("this is iphone 5 only")
        }
    }
}
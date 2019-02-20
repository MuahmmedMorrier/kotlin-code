fun main(args: Array<String>) {
  //Arrays
    val nums = arrayOf(1,5,7,7,8,9999,7,76,665,5,443,3)
    //                 0,1,2,3 ...
    //nums.forEach {        println(it)    }
    nums[0] = 1000
    //nums.forEach { println(it) }
    println(nums[0])
    println(nums[4])
    val num = nums.clone()
    num.forEach { println(it) }

}

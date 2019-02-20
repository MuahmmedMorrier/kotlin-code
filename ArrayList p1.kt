import java.util.ArrayList

// ArrayList

fun main(args: Array<String>) {
    var arlist = ArrayList<String>()
    arlist.add("Lesson 1") // index 0
    arlist.add("Lesson 2") // index 1

    arlist.add("Lesson 3") // index 2

    //println(arlist[0])
    //println(arlist[2])
    println(arlist.get(0))
    //arlist.add("lesson 4")
    //println(arlist[3])
    arlist[0] = "lesson 1000"
    println(arlist[0])
    arlist.set(0, "lesson 200")
    println(arlist.get(0))
}
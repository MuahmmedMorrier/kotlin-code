import java.io.FileReader

// ByteStream
// FileInputStream


// Character Stream
// FileReader

fun main(args: Array<String>) {
    val filereader = FileReader("oldfile.txt")
    //var c = filereader.readLines()
    //for(i in 0 .. c.lastIndex){
       // println(c[i])
    //}
    var c_all = filereader.readText()
    println(c_all)
    filereader.close()
}
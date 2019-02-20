import java.io.FileInputStream

// FileInputStream
//ASCII code
// 8-bit == byte

fun main(args: Array<String>) {
    val fos :FileInputStream = FileInputStream("oldfile.txt")
    var i :Int = fos.read() // H

    while (i != -1){
        
        print(i.toChar())//H
        i = fos.read() // e
    }
}
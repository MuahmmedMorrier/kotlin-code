import java.io.File
import java.io.FileInputStream

// FileInputStream
//ASCII code
// 8-bit == byte

fun main(args: Array<String>) {
    val fileis :FileInputStream = FileInputStream("oldfile.txt")

    val red = fileis.readBytes() // n

    // dosnot make exception
    for(c  in 0..red.lastIndex - 1){
        print(red[c].toChar())
    }
    fileis.close()

}
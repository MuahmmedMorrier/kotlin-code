import java.io.FileWriter

// Character Stream
// FileReader
// FileWriter
fun main(args: Array<String>) {
    val filewriter = FileWriter("newfile.txt")
    //filewriter.write("FileWriter class")
    //filewriter.append('\n')
    //filewriter.append('c')
    //filewriter.append('b')
    //filewriter.flush()
    //filewriter.close()
    var x = charArrayOf('c','x','n')
    //filewriter.write(x)
    //filewriter.append('\t')
    filewriter.append('v')
    filewriter.flush()
    filewriter.close()
}
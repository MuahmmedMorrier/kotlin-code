import java.io.*

/* Data Stream
* primitive types and strings
* DataOutputStream // write
* DataInputStream // read
*/
fun main(args: Array<String>) {
    val dos = DataOutputStream(BufferedOutputStream(FileOutputStream("oldfile.txt")))
    val dis = DataInputStream(BufferedInputStream(FileInputStream("oldfile.txt")))
    dos.writeChar(97) // a
    dos.writeInt(23)

    dos.writeBytes("DataOutputStream")
    dos.writeDouble(23.7)
    dos.writeBytes("DataInputStream")
    dos.flush()
    dos.close()


    println(dis.readChar())
    println(dis.readInt())

    dis.readBytes().forEach {
        print(it.toChar())
    }
    //println("")
    dis.close()

}
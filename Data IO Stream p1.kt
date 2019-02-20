import java.io.*

/* Data Stream
* primitive types and strings
* DataOutputStream // write
* DataInputStream // read
*/
fun main(args: Array<String>) {
    val dos = DataOutputStream(BufferedOutputStream(FileOutputStream("oldfile.txt")))
    val dis = DataInputStream(BufferedInputStream(FileInputStream("oldfile.txt")))

    dos.writeInt(23)
    dos.writeInt(2000)
    dos.writeInt(10)
    dos.writeBytes("DataOutputStream")
    dos.writeBytes("DataInputStream")
    dos.flush()
    dos.close()
    println(dis.readInt())
    println(dis.readInt())
    println(dis.readInt())
    dis.readBytes().forEach {
        print(it.toChar())
    }
    println("")
    dis.readBytes().forEach {
        print(it.toChar())
    }
}
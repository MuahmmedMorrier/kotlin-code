import java.io.FileOutputStream

//FileOutputStream
fun main(args: Array<String>) {
    val fileos :FileOutputStream = FileOutputStream("newfile.txt")
    var x :ByteArray = kotlin.ByteArray(3)
    x[0] = 65 ; x[1] = 66 ; x[2] = 67// A B C D
    //for( i in 0 .. x.lastIndex){
        //fileos.write(x[i])
    //}
    fileos.write(x)
}
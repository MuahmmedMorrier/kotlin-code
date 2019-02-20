fun main(args: Array<String>) {
    println("Enter your id")
    var id = readLine()!!.toInt()
    println("Enter the subject name")
    var subject = readLine()!!.toString()

    var mark = when(subject){
        "Math" -> {
            if(id == 27)
                90
            else{
                null
            }

        }

        "Geometery" -> {
            if(id == 27)
                95
            else
                null

        }
        "English" ->{
            if(id == 27)
                99
            else
                null
        }
        else ->        null
    }
    println(mark)
}
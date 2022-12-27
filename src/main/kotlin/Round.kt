class Round {

    lateinit var playerOne: String
    lateinit var playerTwo: String
    lateinit var status: String
    var points: MutableList<String> = mutableListOf()

    fun roundOne(){
        print("1. Masukkan pemain 1: ")
        playerOne = readln()
        print("2. Masukkan pemain 2: ")
        playerTwo = readln()
        println(match(playerOne, playerTwo))
    }

    fun roundThree(){
        for (i in 1..3){
            roundOne()
            points.add(match(playerOne, playerTwo))
        }

        var pointPlayerOne = points.count { it == "Pemain 1 MENANG!" }
        var pointPlayerTwo = points.count { it == "Pemain 2 MENANG!" }

        if (pointPlayerOne > pointPlayerTwo){
            println("Pemenangnya adalaahhhhh... Pemain 1")
        }
        if (pointPlayerOne < pointPlayerTwo) {
            println("Pemenangnya adalaahhhhh... Pemain 2")
        }
        if (pointPlayerOne == pointPlayerTwo){
            println("Pemenangnya adalaahhhhh... DRAW!!!!")
        }
    }

    fun match(playerOne:String, playerTwo: String): String{
        if (playerOne.lowercase() == playerTwo.lowercase()){
            status = "DRAW!"
            return status
        } else if (playerOne.lowercase() == "batu"){
            status = if (playerTwo.lowercase() == "gunting") {
                "Pemain 1 MENANG!"
            } else {
                "Pemain 2 MENANG!"
            }
        } else if (playerOne.lowercase() == "gunting") {
            status =  if (playerTwo.lowercase() == "kertas") {
                "Pemain 1 MENANG!"
            } else {
                "Pemain 2 MENANG!"
            }
        } else if (playerOne.lowercase() == "kertas") {
            status =  if (playerTwo.lowercase() == "batu") {
                "Pemain 1 MENANG!"
            } else {
                "Pemain 2 MENANG!"
            }
        }
        return status
    }
}
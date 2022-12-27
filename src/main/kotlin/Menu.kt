class Menu {

    lateinit var inputRound: String
    lateinit var inputPlay:String

    fun menuScreen(){
        do {
            println("==========================")
            println("GAME SUIT TERMINAL VERSION")
            println("==========================")
            println("1. Satu Ronde")
            println("2. Tiga Ronde")
            print("Pilih ronde: ")
            inputRound = readln()
            if (inputRound == "1"){
                var oneRound = Round()
                oneRound.roundOne()
            }
            if (inputRound == "2"){
                var threeRounds = Round()
                threeRounds.roundThree()
            }
            print("Mau main lagi? Ketik y/n:  ")
            inputPlay = readln()

        }while (inputPlay == "y")

    }

}
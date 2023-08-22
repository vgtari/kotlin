fun main(args: Array<String>) {
    var marks = 100
    var grade =
        if (marks <= 40){
            println("E")
        }else if (marks <= 50){
            println("D")
        }else if (marks <= 60){
            println("C")
        }else if (marks <= 70) {
            println("B")
        }else {
            println("A")
        }
    println(grade)
    var bettingNumber = 0
    var bettingResults = when(bettingNumber){
        1 -> {
            println("You won a car")
        }
        2 -> {
            println("You won a horse")
        }
        3 -> {
            println("You won 3M")
        }
        4 -> {
            println("You lost")
        }
        else -> {
            println("Enter a number between 1 - 4 to bet")
        }
    }
    println(bettingNumber)
}
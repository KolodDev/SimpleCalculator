var secondNumber:Int = 0
var firstNumber:Int =0
var operation : Char = '+'

fun main() {

        println("Enter the first number : ")
        firstNumber = readln().toInt()
        println("Enter the second number : ")
        secondNumber = readln().toInt()

        println("choose the operation + , - , * , / : ")
        operation= readln().single()

        when (operation) {
            '+' -> addOperation()
            '-' -> subOperation()
            '*' -> multiOperation()
            '/' -> divOperation()
        }



}

fun addOperation() {
    println("$firstNumber + $secondNumber = ${firstNumber+secondNumber}")

}

fun subOperation() {
    println("$firstNumber - $secondNumber = ${firstNumber-secondNumber}")

}

fun multiOperation() {
    println("$firstNumber * $secondNumber = ${firstNumber*secondNumber}")

}

fun divOperation() {
    if (secondNumber==0){
        print("can't divide by zero")
    }else {
        println("$firstNumber / $secondNumber = ${firstNumber / secondNumber}")
    }

}




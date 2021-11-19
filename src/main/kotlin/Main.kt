fun InputInformation(): Unit {
    println("Задайте игру в нормальной форме для 2-х игроков.")
    println("n - количество стратегий для 1-го игрока.")
    println("m - количество стратегий для 2-го игрока.")
    println("n: ")
    val n = readLine() //A_i
    val numberOfStrategies_1 = n?.toInt()
    println("m: ")
    val m = readLine() //B_i
    val numberOfStrategies_2 = m?.toInt()
    println("Введите значения выйгрышей.")
    println("* Ввод значений выигрышей осуществляется по ячейкам матрицы выигрышей:")
    println("| a   | c   | e   |")
    println("|   b |   d |   f |")
    println("-------------------")
    println("| g   | i   | k   |")
    println("|   h |   j |   l |")
    println("В порядке a -> b -> c -> d -> e -> f -> g -> h -> i -> j -> k -> l")

//Тут нужно будет обрабатывать дохрена исключений по вводу. Пустой ввод, ввод не числа, можно сделать это в when. Подумать над этим.
    // Именование переменных с маленькой буквы. Это "хороший тон"
    // через Shift + F6 можно отредактировать имя переменной во всех местах сразу. Попробуй Enter в конце
    val numberOfStrategies = (numberOfStrategies_1!! * numberOfStrategies_2!!)*2
    val gameMatrixValues = mutableListOf<Double?>()
    for (element in 0 until numberOfStrategies){
        var enter = readLine()
        var New_enter = enter?.toDouble()
        gameMatrixValues.add(element, New_enter)
    }
    //if (GameMatrixValues.size > NumberOfStrategies-1)
     //   GameMatrixValues.removeAt(NumberOfStrategies)
    println(gameMatrixValues)

    val matrixValuesFirst = mutableListOf<Double?>()
    val matrixValuesSecond = mutableListOf<Double?>()

    for (i in 0 until numberOfStrategies step 2){
        matrixValuesFirst.add(gameMatrixValues[i])
    }
    for (i in 1 until numberOfStrategies step 2){
        matrixValuesSecond.add(gameMatrixValues[i])
    }

    //if (MatrixValuesFirst.size > 0)
      //  MatrixValuesFirst.removeAt(0)
    //if (MatrixValuesSecond.size > 0)
      //  MatrixValuesSecond.removeAt(0)
    println(matrixValuesFirst)
    println(matrixValuesSecond)
}

fun main(args: Array<String>) {
    InputInformation()
}
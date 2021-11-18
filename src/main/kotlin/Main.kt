fun InputInformation(): Unit {
    println("Задайте игру в нормальной форме для 2-х игроков.")
    println("n - количество стратегий для 1-го игрока.")
    println("m - количество стратегий для 2-го игрока.")
    println("n: ")
    val n = readLine() //A_i
    val NumberOfStrategies_1 = n?.toInt()
    println("m: ")
    val m = readLine() //B_i
    val NumberOfStrategies_2 = m?.toInt()
    println("Введите значения выйгрышей.")
    println("* Ввод значений выигрышей осуществляется по ячейкам матрицы выигрышей:")
    println("| a   | c   | e   |")
    println("|   b |   d |   f |")
    println("-------------------")
    println("| g   | i   | k   |")
    println("|   h |   j |   l |")
    println("В порядке a -> b -> c -> d -> e -> f -> g -> h -> i -> j -> k -> l")

//Тут нужно будет обрабатывать дохрена исключений по вводу. Пустой ввод, ввод не числа, можно сделать это в when. Подумать над этим.
    val NumberOfStrategies = (NumberOfStrategies_1!! * NumberOfStrategies_2!!)*2
    val GameMatrixValues = mutableListOf<Double?>(0.0)
    for (element in 0 until NumberOfStrategies){
        var enter = readLine()
        var New_enter = enter?.toDouble()
        GameMatrixValues.add(element, New_enter)
    }
    if (GameMatrixValues.size > NumberOfStrategies-1)
        GameMatrixValues.removeAt(NumberOfStrategies)
    println(GameMatrixValues)

    val MatrixValuesFirst = mutableListOf<Double?>(0.0)
    val MatrixValuesSecond = mutableListOf<Double?>(0.0)

    for (i in 0 until NumberOfStrategies step 2){
        MatrixValuesFirst.add(GameMatrixValues[i])
    }
    for (i in 1 until NumberOfStrategies step 2){
        MatrixValuesSecond.add(GameMatrixValues[i])
    }

    if (MatrixValuesFirst.size > 0)
        MatrixValuesFirst.removeAt(0)
    if (MatrixValuesSecond.size > 0)
        MatrixValuesSecond.removeAt(0)
    println(MatrixValuesFirst)
    println(MatrixValuesSecond)
}

fun main(args: Array<String>) {
    InputInformation()
}
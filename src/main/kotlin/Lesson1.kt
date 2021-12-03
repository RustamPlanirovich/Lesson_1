import java.lang.Thread.sleep
import java.math.BigDecimal

fun main(args: Array<String>) {
    println(greeting(first = "Masha", last = "Ivanova"))
//    println(greeting(first = "Masha"))
//    println(greeting(first = readLine().toString(), last = readLine().toString()))

//    do {
//        val command = readLine()
//        println("command: $command")
//    } while (command != "exit")
//    val one = 1..5
//    for (i in one) {
//        println(i)
//    }

    val array = arrayOf(1, 2, 3, 4)
    array.set(0, 2)
    array[0] = 3
    println(array[0])

    val list = listOf(1, 2, 3, 4)
//    list[0] = 3

    val pair = Pair("One", "Two")
    println("first: ${pair.first}, second: ${pair.second}")
    val infixPair = 1 to "Two"
    println("first: ${infixPair.first}, second: ${infixPair.second}")

    val map  = mapOf( 1 to "Two", 3 to "Four")
    for ((f,s) in map){
        println("f: $f, s: $s")
    }
}

fun japaneseSalary(base: BigDecimal, years: Int): BigDecimal {
    require(base > BigDecimal.ZERO) { "Base salary can't be negative" }
    return base + 10_000.toBigDecimal() * years.toBigDecimal()
}

fun greeting(first: String, last: String = "Ivanova"): String {
    require(!first.isBlank()) { "Нужно указать имя" }
    require(!last.isBlank()) { "Нужно указать фамилию" }

//    var counter = 0
//    while (counter < 10) {
//        println("${ counter++ }")
//    }


    return "Hello, $first $last"
}
package ProblemSolving.Algorithms.Warmup

import java.util.*

fun birthdayCakeCandles(ar: Array<Int>): Int {
    var max = 0
    var count = 0

    for (num in ar) {
        if (num > max) {
            max = num
            count = 0
        }
        if (num == max)
            count++
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}

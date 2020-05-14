package ProblemSolving.Algorithms.Warmup

import java.util.*

fun staircase(n: Int): Unit {
    for (row in 1..n) {
        for (column in 1..n) {
            if (row >= (column + row - n) && (column + row - n) > 0)
                print("*")
            else
                print(" ")
        }
        println("")
    }
}


fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}

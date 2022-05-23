package ProblemSolving.Algorithms.Implementation

import java.util.*


fun migratoryBirds(arr: Array<Int>): Int {
    return arr.groupBy { it }
        .mapValues { (_, array) -> array.size }
        .entries
        .sortedBy { entry -> entry.key }
        .maxBy { entry -> entry.value }
        ?.key ?: 0
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}

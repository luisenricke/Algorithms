package ProblemSolving.Algorithms.Implementation

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var countMax = 0
    var countMin = 0
    var max: Int = scores[0]
    var min: Int = scores[0]

    for (index in scores.indices) {
        max = if (scores[index] > max) scores[index]
                .also { countMax++ } else max
        min = if (scores[index] < min) scores[index]
                .also { countMin++ } else min
    }

    return arrayOf(countMax, countMin)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}

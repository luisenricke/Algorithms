package ProblemSolving.Algorithms.Implementation

import java.util.*
import kotlin.io.*
import kotlin.text.*

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    return if (v1 > v2 && (x2 - x1) % (v1 - v2) == 0) "YES" else "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}

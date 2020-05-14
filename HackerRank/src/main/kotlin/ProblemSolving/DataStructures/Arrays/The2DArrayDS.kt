package ProblemSolving.DataStructures.Arrays

import java.util.*

fun hourglassSum(arr: Array<Array<Int>>): Int {

    var result: Int = Int.MIN_VALUE
    for (y in 0..arr.size - 3) {
        for (x in 0..arr.size - 3) {
            var aux: Int = arr[y][x] + arr[y][x + 1] + arr[y][x + 2] +
                    arr[y + 1][x + 1] +
                    arr[y + 2][x] + arr[y + 2][x + 1] + arr[y + 2][x + 2]

            result = if (aux > result) aux else result
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}

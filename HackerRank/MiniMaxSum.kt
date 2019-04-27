import java.math.BigInteger
import java.util.*

/**
 * @author: Luis Villalobos
 * @link: https://www.hackerrank.com/challenges/mini-max-sum/problem
 * @subdomain: warmup
 * @difficulty: easy
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    var aux: BigInteger = 0.toBigInteger()
    var max: BigInteger = 0.toBigInteger()
    var min: BigInteger = 0.toBigInteger()

    for (row in arr.indices) {
        for ((column, value) in arr.withIndex()) {
            if (row != column)
                aux += value.toBigInteger()
        }
        max = if (aux > max) aux else max
        min = when {
            aux < min -> aux
            row == 0 -> aux
            else -> min
        }
        aux = 0.toBigInteger()
    }
    println("$min $max")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
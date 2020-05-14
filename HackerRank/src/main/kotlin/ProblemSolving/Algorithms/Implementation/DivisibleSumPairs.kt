package ProblemSolving.Algorithms.Implementation

import java.util.*

/**
 * @author: Luis Villalobos
 * @link: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 * @subdomain: implementation
 * @difficulty: easy
 */

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {

    var result = 0
    var indexArray = 0

    while (indexArray < n - 1) {
        ar.filterIndexed { index, element -> index > indexArray }
                .forEachIndexed { index, element ->
                    // println(" [ ${indexArray} ][ ${index + 1} ] = ${ar[indexArray]} + $element  = [${ar[indexArray] + element}]")
                    result = if ((ar[indexArray] + element) % k == 0) result + 1 else result
                }
        // println("")

        indexArray++
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)

}

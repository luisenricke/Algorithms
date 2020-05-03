/**
 * @author: Luis Villalobos
 * @link: https://www.hackerrank.com/challenges/the-birthday-bar/problem
 * @subdomain: implementation
 * @difficulty: easy
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var portions = 0
    var indexSquareChocolate = 0
    while (indexSquareChocolate < s.size) {
        // println("$indexSquareChocolate")

        val totalSquaresChocolate: Int = s.filterIndexed { index, element -> index >= indexSquareChocolate && index <= indexSquareChocolate + m - 1 }.sum()

        portions = if (totalSquaresChocolate == d) portions + 1 else portions

        // println("Count of squares  $totalSquaresChocolate")
        // println("Portions $portions")
        // println("")

        indexSquareChocolate++
    }

    return portions
}

fun main() {

    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
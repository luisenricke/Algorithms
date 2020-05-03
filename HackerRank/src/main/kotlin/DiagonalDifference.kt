import java.util.*

/**
 * @author: Luis Villalobos
 * @link: https://www.hackerrank.com/challenges/diagonal-difference/problem
 * @subdomain: warmup
 * @difficulty: easy
 */

fun diagonalDifference(matrix: Array<Array<Int>>): Int {
    var firstDiagonal = 0
    var secondDiagonal = 0
    for (x in 0..matrix.size - 1) {
        for (y in 0..matrix[0].size - 1) {
            if (x == y) firstDiagonal += matrix[x][y]
            if (x == matrix.size - 1 - y && x == matrix.size - 1 - y) secondDiagonal += matrix[x][y]
        }
    }
    return Math.abs(firstDiagonal - secondDiagonal)
}

fun main() {

    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val matrix = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        matrix[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }
    println("${diagonalDifference(matrix)}")
}
/**
 * @author: Luis Villalobos
 * @link: https://www.hackerrank.com/challenges/a-very-big-sum/problem
 * @subdomain: warmup
 * @difficulty: easy
 */

fun aVeryBigSum(array: Array<Long>): Long {
    var result: Long = 0
    for (count in 0..array.size - 1)
        result += array[count]
    return result
}


fun main() {
    var lenghtOfArray: Int = readLine()!!.toInt()
    var arrayLong = Array<Long>(lenghtOfArray) { readLine()!!.toLong() }
    println("${aVeryBigSum(arrayLong)}")
}
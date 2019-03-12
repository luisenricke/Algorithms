/**
 * @author: Luis Villalobos
 * @link: https://leetcode.com/problems/fibonacci-number/
 * @number: 509
 * @difficulty: easy
 */

fun fibonacci(number:Int):Int{
    when (number) {
        0 -> return 0
        1 -> return 1
        else -> return fibonacci(number - 1) + fibonacci(number - 2)
    }
}

fun main(args: Array<String>) {
    var result = fibonacci(readLine()!!.toInt())
    println(result)
}
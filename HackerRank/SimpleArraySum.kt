/**
 * @author: Luis Villalobos
 * @link: https://www.hackerrank.com/challenges/simple-array-sum/problem
 * @subdomain: warmup
 * @difficulty: easy
 */

fun simpleArraySum(array: Array<Int>): Int {
    var result = 0
    for (item in array)
        try {
            result += item
        }catch (e: NumberFormatException){
            println("Input isn't number")
        }
    return result
}

fun main() {

        println("The lenght of array: ")
        var lenghtOfArray: Int = readLine()!!.toInt()
        println("Numbers of array: ")
        var arrayint = Array<Int>(lenghtOfArray) { readLine()!!.toInt() }
        println("The sum of array is: ${simpleArraySum(arrayint)}")

}
/**
 * @author: Luis Villalobos
 * @link: https://projecteuler.net/problem=1
 * @number: 1
 */

fun multiplesOf3And5(vararg number: Int): Int {

    var result = 0

    /*for (count in number downTo 0 step 1) {
        if (count % 3 == 0 || count % 5 == 0)
            result += count
        println("number: $count")
    }*/

    while (number[0] > 0) {
        if (number[0] % 3 == 0 || number[0] % 5 == 0)
            result += number[0]
        number[0]--
    }

    return result
}

fun main() {
    println(multiplesOf3And5(999))
}
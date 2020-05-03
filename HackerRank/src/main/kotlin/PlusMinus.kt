import java.lang.Exception
import java.util.*

/**
 * @author: Luis Villalobos
 * @link: https://www.hackerrank.com/challenges/plus-minus/problem
 * @subdomain: warmup
 * @difficulty: easy
 */

fun main() {


    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)


}

fun plusMinus(arr: Array<Int>): Unit {
    var zero:Double=0.0
    var positive:Double=0.0
    var negative:Double=0.0

    for (number in arr){
        if (number>0 && number!=0)
            positive += 1
        if (number<0 && number!=0)
            negative += 1
        if (number==0)
            zero+=1
    }

    println(positive/arr.size)
    println(negative/arr.size)
    println(zero/arr.size)

}
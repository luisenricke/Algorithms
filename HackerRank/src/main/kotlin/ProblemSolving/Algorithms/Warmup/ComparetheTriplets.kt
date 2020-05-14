package ProblemSolving.Algorithms.Warmup

fun compareTriplets(x: Array<Int>, y: Array<Int>): Array<Int> {
    var points: Array<Int> = arrayOf(0, 0)
    for (count in 0..2) {
        if (x[count] > y[count]) points[0]++
        if (x[count] < y[count]) points[1]++
        if (x[count] == y[count]) continue
    }
    return points
}

fun main() {

    var bob = Array<Int>(3) { readLine()!!.toInt() }
    var alice = Array<Int>(3) { readLine()!!.toInt() }
    val result = compareTriplets(bob, alice)
    println(result.joinToString(" "))

}

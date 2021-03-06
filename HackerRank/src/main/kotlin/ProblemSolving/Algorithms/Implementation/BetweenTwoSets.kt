package ProblemSolving.Algorithms.Implementation

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    val factors = mutableListOf<Int>()
    val list: Set<Int> = a.union(b.asList())
    for (value in a.max()!!..b.min()!!) {
        repeat(list.filter { a.all { value % it == 0 } }
                .filter { b.all { it % value == 0 } }.size) {
            if(!factors.contains(value)) {
                factors.add(value)
            }
        }
    }
    return factors.size
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}

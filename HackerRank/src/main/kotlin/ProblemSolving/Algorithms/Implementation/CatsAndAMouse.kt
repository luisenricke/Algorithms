package ProblemSolving.Algorithms.Implementation

import java.util.*
import kotlin.math.abs

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val differenceCatA = abs(x - z)
    val differenceCatB = abs(y - z)
    return if (differenceCatA == 1 && differenceCatB == 1) "Mouse C" else
        if (differenceCatA > differenceCatB) "Cat B" else
            if (differenceCatA < differenceCatB) "Cat A" else
                "Mouse C"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}

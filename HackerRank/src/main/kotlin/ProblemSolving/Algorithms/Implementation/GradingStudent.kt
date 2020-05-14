package ProblemSolving.Algorithms.Implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun gradingStudents(grades: Array<Int>): Array<Int> {
    for (index in grades.indices) {
        if (grades[index] >= 38 && grades[index].rem(5) >= 3) {
            grades[index] += 5 - grades[index].rem(5)
        }
    }
    return grades
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)
    println(result.joinToString("\n"))
}

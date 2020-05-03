import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    val checker = s.contains("AM")
    var returnValue = s.substring(0, s.length - 2)

    if (checker && returnValue.startsWith("12"))
        returnValue = returnValue.substring(0, 2).toInt()
                .minus(12).toString()
                .plus("0")
                .plus(returnValue.substring(2))

    if (!checker && !returnValue.startsWith("12"))
        returnValue = returnValue.substring(0, 2).toInt()
                .plus(12).toString()
                .plus(returnValue.substring(2))

    return returnValue
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}

fun fibonacci(number:Int):Int{
    if(number == 0)
        return 0
    else if(number == 1)
        return 1
    else
        return fibonacci(number - 1) + fibonacci(number - 2)
}

fun main(args: Array<String>) {
    var result = fibonacci(readLine()!!.toInt())
    println(result)
}
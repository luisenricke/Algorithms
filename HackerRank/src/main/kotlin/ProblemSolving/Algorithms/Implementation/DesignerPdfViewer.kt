package ProblemSolving.Algorithms.Implementation

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val alphabet = ('a'..'z').toMutableList()
    val mapped = alphabet.zip(h).toMutableList()
    val length = word.length
    val letters = word.toCharArray().toTypedArray()
    val max = letters.maxBy { value -> h[alphabet.indexOf(value)] }
    val maxBy = mapped.find { value -> max == value.first  }
    return length * (maxBy?.second ?: 0)
}

fun main(args: Array<String>) {

    val h = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val word = readLine()!!

    val result = designerPdfViewer(h, word)

    println(result)
}

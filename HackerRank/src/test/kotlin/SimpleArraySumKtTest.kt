import org.junit.Test

import org.junit.Assert.*

class SimpleArraySumKtTest {

    @Test
    fun simpleArraySum() {
        var simpleArray: Array<Int> = arrayOf(5, 5, 5)
        assertEquals(15, ProblemSolving.Algorithms.Warmup.simpleArraySum(simpleArray))
    }
}

import org.junit.Test

import org.junit.Assert.*

class DivisibleSumPairsKtTest {

    @Test
    fun divisibleSumPairs() {
        assertEquals(5,
            ProblemSolving.Algorithms.Implementation.divisibleSumPairs(
                6,
                3,
                arrayOf(1, 3, 2, 6, 1, 2)
            )
        )
    }
}

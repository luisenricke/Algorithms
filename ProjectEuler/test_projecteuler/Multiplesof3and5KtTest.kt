package test_projecteuler

import multiplesOf3And5
import org.junit.Test
import kotlin.test.assertEquals

internal class Multiplesof3and5KtTest {

    @Test
    fun multiplesOf3And5() {
        assertEquals(23,multiplesOf3And5(9))
    }

    @Test
    fun multiplesOf3And5_bellowThan1000() {
        assertEquals(233168,multiplesOf3And5(999))
    }

}
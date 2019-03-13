package test_hackerrank

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import simpleArraySum
import java.io.IOException
import java.lang.NumberFormatException
import kotlin.test.assertFailsWith
import kotlin.test.expect

internal class SimpleArraySumKtTest {

    @Test
    fun simpleArraySum() {
        var simpleArray: Array<Int> = arrayOf(5, 5, 5)
        assertEquals(15, simpleArraySum(simpleArray))
    }

}
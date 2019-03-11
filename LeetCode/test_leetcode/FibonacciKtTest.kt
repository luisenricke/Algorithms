package test_leetcode

import fibonacci
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FibonacciKtTest {

    @Test
    fun fibonacci1() {
        assertEquals(1, fibonacci(1))
    }

    @Test
    fun fibonacci2() {
        assertEquals(1, fibonacci(2))
    }

    @Test
    fun fibonacci3() {
        assertEquals(2, fibonacci(3))
    }

    @Test
    fun fibonacci10() {
        assertEquals(55, fibonacci(10))
    }
}
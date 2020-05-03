import org.junit.Test

import org.junit.Assert.*

class BirthdayChocolateKtTest {

    @Test
    fun birthdayOne() {
        assertEquals(2, birthday(arrayOf(1,2,1,3,2), 3,2))
    }

    @Test
    fun birthdayTwo() {
        assertEquals(0, birthday(arrayOf(1,1,1,1,1,1), 3,2))
    }

    @Test
    fun birthdayThree() {
        assertEquals(1, birthday(arrayOf(4), 4,1))
    }
}
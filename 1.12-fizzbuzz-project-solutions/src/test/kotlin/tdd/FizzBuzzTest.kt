package tdd

import org.example.tdd.FizzBuzz
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource


@TestMethodOrder(OrderAnnotation::class)
class FizzBuzzTest {

    var fizzBuzz = FizzBuzz()
    // If number is divisible by 3, print Fizz
    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    fun testForDivisibleByThree() {
        val expected = "Fizz"

        assertEquals(expected, fizzBuzz.compute(3), "Should return Fizz")
    }

    // If number is divisible by 5, print Buzz
    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    fun testForDivisibleByFive() {
        val expected = "Buzz"

        assertEquals(expected, fizzBuzz.compute(5), "Should return Buzz")
    }

    // If number is divisible by 3 and 5, print FizzBuzz
    @DisplayName("Divisible by Three and Five")
    @Test
    @Order(3)
    fun testForDivisibleByThreeAndFive() {
        val expected = "FizzBuzz"

        assertEquals(expected, fizzBuzz.compute(15), "Should return FizzBuzz")
    }

    // If number is NOT divisible by 3 or 5, then print the number
    @DisplayName("Not Divisible by Three or Five")
    @Test
    @Order(4)
    fun testForNotDivisibleByThreeOrFive() {
        val expected = "1"

        assertEquals(expected, fizzBuzz.compute(1), "Should return 1")
    }

    @DisplayName("Testing with Small data file")
    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = ["/small-test-data.csv"])
    @Order(5)
    fun testSmallDataFile(value: Int, expected: String?) {
        assertEquals(expected, fizzBuzz.compute(value))
    }
}
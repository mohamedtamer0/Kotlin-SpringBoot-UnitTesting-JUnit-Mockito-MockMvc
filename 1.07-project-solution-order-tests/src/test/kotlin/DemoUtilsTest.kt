import org.example.DemoUtils
import org.junit.jupiter.api.*
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import java.time.Duration
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNull

@TestMethodOrder(OrderAnnotation::class)
class DemoUtilsTest {

    var demoUtils = DemoUtils()

    @BeforeEach
    fun setupBeforeEach() {
        demoUtils = DemoUtils()
        println("@BeforeEach executes before the execution of each test method")
    }

    @AfterEach
    fun setupAfterEach() {
        demoUtils = DemoUtils()
        println("@AfterEach")
        println()
    }

    companion object {
        @BeforeAll
        @JvmStatic
        fun setupBeforeAll() {
            println("@BeforeAll")
            println()
        }

        @AfterAll
        @JvmStatic
        fun setupAfterAll() {
            println("@AfterAll")
        }
    }

    //@DisplayName("Equals and Not Equals")
    @Test
    @Order(1)
    fun test_Equals_And_Not_Equals() {
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6")
        assertNotEquals(6, demoUtils.add(1, 4), "2+4 must not be 6")
    }

    //@DisplayName("Null and Not Null")
    @Test
    @Order(0)
    fun test_Null_And_Not_Null() {
        val str1: String? = null
        val str2 = "Tamer"
        assertNull(demoUtils.checkNull(str1), "Object should be null")
        Assertions.assertNotNull(demoUtils.checkNull(str2), "Object should not be null")
    }


    @DisplayName("Same And Not Same")
    @Test
    fun testSameAndNotSame() {
        val str = "Tamer"

        Assertions.assertSame(demoUtils.academy, demoUtils.academyDuplicate, "Object Should be to Same Object")
        Assertions.assertNotSame(str, demoUtils.academy, "Object Should not refer to Same Object")
    }


    @DisplayName("True and False")
    @Test
    fun testTrueAndFalse() {
        val gradeOne = 10
        val gradeTwo = 5

        Assertions.assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This Should return true")
        Assertions.assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This Should return false")
    }


    @DisplayName("Array Equals")
    @Test
    fun testArrayEquals() {
        val stringsArray = arrayOf("A", "B", "C")
        Assertions.assertArrayEquals(stringsArray, demoUtils.firstThreeLettersOfAlphabet, "Array should be the Same")
    }

    @DisplayName("Iterable equals")
    @Test
    fun testIterableEquals() {
        val theList: List<String?> = listOf("Tamer", "2", "code")

        Assertions.assertIterableEquals(theList, demoUtils.academyInList, "Expected list should be same as actual list")
    }


    @DisplayName("Lines match")
    @Test
    @Order(30)
    fun testLinesMatch() {
        val theList = listOf("Tamer", "2", "code")

        Assertions.assertLinesMatch(theList, demoUtils.academyInList, "Lines should match")
    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    fun testThrowsAndDoesNotThrow() {
        Assertions.assertThrows(
            Exception::class.java,
            { demoUtils.throwException(-1) }, "Should throw exception"
        )

        Assertions.assertDoesNotThrow({ demoUtils.throwException(5) }, "Should not throw exception")
    }

    @DisplayName("Timeout")
    @Test
    fun testTimeout() {
        Assertions.assertTimeoutPreemptively(
            Duration.ofSeconds(3), { demoUtils.checkTimeout() },
            "Method should execute in 3 seconds"
        )
    }

}

import org.example.DemoUtils
import org.junit.jupiter.api.*
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores

@DisplayNameGeneration(ReplaceUnderscores::class)
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
    fun test_Equals_And_Not_Equals() {
        Assertions.assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6")
        Assertions.assertNotEquals(6, demoUtils.add(1, 4), "2+4 must not be 6")
    }

    //@DisplayName("Null and Not Null")
    @Test
    fun test_Null_And_Not_Null() {
        val str1: String? = null
        val str2 = "Tamer"
        Assertions.assertNull(demoUtils.checkNull(str1), "Object should be null")
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
}

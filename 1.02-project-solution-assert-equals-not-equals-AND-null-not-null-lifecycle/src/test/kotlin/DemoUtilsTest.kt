import org.example.DemoUtils
import org.junit.jupiter.api.*

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


    @Test
    fun testEqualsAndNotEquals() {
        Assertions.assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6")
        Assertions.assertNotEquals(6, demoUtils.add(1, 4), "2+4 must not be 6")
    }

    @Test
    fun testNullAndNotNull() {
        val str1: String? = null
        val str2 = "Tamer"
        Assertions.assertNull(demoUtils.checkNull(str1), "Object should be null")
        Assertions.assertNotNull(demoUtils.checkNull(str2), "Object should not be null")
    }
}

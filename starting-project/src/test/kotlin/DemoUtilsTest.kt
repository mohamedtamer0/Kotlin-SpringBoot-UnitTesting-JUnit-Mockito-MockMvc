import org.example.DemoUtils
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DemoUtilsTest {
    @Test
    fun testEqualsAndNotEquals() {
        val demoUtils = DemoUtils()
        Assertions.assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6")
        Assertions.assertNotEquals(6, demoUtils.add(1, 4), "2+4 must not be 6")
    }

    @Test
    fun testNullAndNotNull() {
        val demoUtils = DemoUtils()
        val str1: String? = null
        val str2 = "Tamer"

        Assertions.assertNull(demoUtils.checkNull(str1), "Object should be null")
        Assertions.assertNotNull(demoUtils.checkNull(str2), "Object should not be null")
    }
}

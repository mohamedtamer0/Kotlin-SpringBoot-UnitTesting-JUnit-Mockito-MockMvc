import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*


internal class ConditionalTest {
    @Test
    @Disabled("Don't run until JIRA #123 is resolved")
    fun basicTest() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    fun testForWindowsOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.MAC)
    fun testForMacOnly() {
        // execute method and perform asserts
    }


    @Test
    @EnabledOnOs(OS.MAC, OS.WINDOWS)
    fun testForMacAndWindowsOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    fun testForLinuxOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    fun testForOnlyForJava17() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    fun testOnlyForJava13() {
        // execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_15)
    fun testOnlyForJavaRange() {
        // execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    fun testOnlyForJavaRangeMin() {
        // execute method and perform asserts
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV", matches = "DEV")
    fun testOnlyForDevEnvironment() {
        // execute method and perform asserts
    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    fun testOnlyForSystemProperty() {
        // execute method and perform asserts
    }
}
package org.example

class DemoUtils {
    val academy: String = "Tamer Academy"
    val academyDuplicate: String = academy
    val firstThreeLettersOfAlphabet: Array<String> = arrayOf("A", "B", "C")
    val academyInList: List<String> = listOf("Tamer", "2", "code")

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun checkNull(obj: Any?): Any? {
        if (obj != null) {
            return obj
        }
        return null
    }

    fun isGreater(n1: Int, n2: Int): Boolean {
        if (n1 > n2) {
            return true
        }
        return false
    }

    @Throws(Exception::class)
    fun throwException(a: Int): String {
        if (a < 0) {
            throw Exception("Value should be greater than or equal to 0")
        }
        return "Value is greater than or equal to 0"
    }

    @Throws(InterruptedException::class)
    fun checkTimeout() {
        println("I am going to sleep")
        Thread.sleep(2000)
        println("Sleeping over")
    }
}
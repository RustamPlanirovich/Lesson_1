import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class JapaneseSalaryTest {

    @Test
    fun salary() {
        assertEquals(150_000.toBigDecimal(), japaneseSalary(100_000.toBigDecimal(), 5))
    }

    @Test
    fun negativeSalary() {
        val thrown = assertThrows<IllegalArgumentException> {
            japaneseSalary((-10).toBigDecimal(), 12)
        }
        assertEquals(thrown.message, "Base salary can't be negative")
    }
}
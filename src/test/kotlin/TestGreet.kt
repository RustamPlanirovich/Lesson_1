import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestGreet {


    @Test
    fun `имя для Света Ивановой`() {

        assertEquals("Hello, Sveta Ivanova", greeting("Sveta", "Ivanova"))

    }
}
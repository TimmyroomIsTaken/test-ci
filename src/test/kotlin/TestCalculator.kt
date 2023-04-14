
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCalculator {

    private val test = Main()

    @Test
    fun calTest() {
        val resAdd = test.calculate(Main.CalType.ADD, 1, 3).toDouble()
        val resSub = test.calculate(Main.CalType.SUB, 2, 1).toDouble()
        val resMul = test.calculate(Main.CalType.MUL, 3, 4).toDouble()
        val resDiv = test.calculate(Main.CalType.DIV, 6, 2).toDouble()

        assertEquals(40.0, resAdd, 0.0)
        assertEquals(1.0, resSub, 0.0)
        assertEquals(12.0, resMul, 0.0)
        assertEquals(3.0, resDiv, 0.0)
    }
}
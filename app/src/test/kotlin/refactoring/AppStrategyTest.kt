package refactoring

import java.io.BufferedReader
import java.io.PrintStream
import java.io.StringReader
import kotlin.test.Test
import kotlin.test.assertEquals

class AppStrategyTest {

    @Test fun getInfo() {
        val app = AppStrategy(BufferedReader(StringReader("someone\nsomewhere\n")), System.out)
        assertEquals(app.requestData(), "Hello someone from somewhere!")
    }

}

package refactoring

import kotlin.test.Test
import kotlin.test.assertEquals

class AppStrategyTest {

    // FIXME: app.requestData() tries to read from stdin in a test
    @Test fun getInfo() {
        val app = AppStrategy()
        assertEquals(app.requestData(), "Hello someone from somewhere!")
    }

}

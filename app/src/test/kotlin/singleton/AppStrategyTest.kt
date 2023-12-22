package singleton

import kotlin.test.Test
import kotlin.test.assertEquals

class AppStrategyTest {
    @Test fun getInfo() {
        val app = AppStrategy()
        assertEquals(app.requestData(), "Hello null from null!")
    }

}

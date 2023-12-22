package singleton

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test fun appDefaultConfig() {
        assertEquals(ConfigMan.getSomeConfig(), 3)
    }
}

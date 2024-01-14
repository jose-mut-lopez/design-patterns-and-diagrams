package problemComplexConfig

import kotlin.test.Test
import kotlin.test.assertEquals

class GreetingFromComplexConfigTest {

    // FIXME: This test fails when running tests in parallel because the ConfigMan is a singleton
    @Test fun defaultConfig() {
        assertEquals(3, ConfigMan().someConfig.storedValue)
    }

    // FIXME: This test fails when running tests in parallel because the ConfigMan is a singleton
    @Test fun makeGreeting() {
        assertEquals("Hello World with config 3!", GreetingFromComplexConfig(ConfigMan()).makeGreeting())
    }

    @Test fun updateGreeting() {
        val greeting = GreetingFromComplexConfig(ConfigMan())
        assertEquals("Hello World with config 3!", greeting.makeGreeting())
        greeting.updateConfig()
        assertEquals("Hello World with config 4!", greeting.makeGreeting())
    }
}

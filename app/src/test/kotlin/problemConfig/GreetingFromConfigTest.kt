package problemConfig

import kotlin.test.Test
import kotlin.test.assertEquals

class GreetingFromConfigTest {

    // FIXME: This test fails when running tests in parallel because the ConfigMan is a singleton
    @Test fun defaultConfig() {
        assertEquals(3, ConfigMan().someConfig)
    }

    // FIXME: This test fails when running tests in parallel because the ConfigMan is a singleton

    @Test fun makeGreeting() {
        assertEquals("Hello World with config 3!", GreetingFromConfig(ConfigMan()).makeGreeting())
    }

    @Test fun updateGreeting() {
        val config = ConfigMan()
        val greeting = GreetingFromConfig(config)
        assertEquals("Hello World with config 3!", greeting.makeGreeting())
        config.someConfig = 7
        assertEquals("Hello World with config 7!", greeting.makeGreeting())
    }
}

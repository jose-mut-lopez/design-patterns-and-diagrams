package singleton

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {

    // FIXME: This test fails when running tests in parallel because the ConfigMan is a singleton
    @Test fun appDefaultConfig() {
        assertEquals(ConfigMan.someConfig, 3)
    }

    // FIXME: This test fails when running tests in parallel because the ConfigMan is a singleton
    @Test fun appGreeting() {
        assertEquals(App().greeting, "Hello World with config 3!")
    }

    @Test fun appGreetingUpdated() {
        val app = App()
        assertEquals(app.greeting, "Hello World with config 3!")
        ConfigMan.someConfig = 7
        assertEquals(app.greeting, "Hello World with config 7!")
    }
}

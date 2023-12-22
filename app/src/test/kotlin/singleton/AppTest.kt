package singleton

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {

    @Test fun appDefaultConfig() {
        assertEquals(ConfigMan().someConfig, 3)
    }

    @Test fun appGreeting() {
        val config = ConfigMan()
        assertEquals(App(config).greeting, "Hello World with config 3!")
    }

    @Test fun appGreetingUpdated() {
        val config = ConfigMan()
        val app = App(config)
        assertEquals(app.greeting, "Hello World with config 3!")
        config.someConfig = 7
        assertEquals(app.greeting, "Hello World with config 7!")
    }
}

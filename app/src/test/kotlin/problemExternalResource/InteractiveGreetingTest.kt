package problemExternalResource

import kotlin.test.Test
import kotlin.test.assertEquals

class InteractiveGreetingTest {

    @Test fun makeGreeting() {
        assertEquals("Hello someone from somewhere!", InteractiveGreeting().makeGreeting())
    }

}

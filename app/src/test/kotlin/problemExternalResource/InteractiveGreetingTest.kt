package problemExternalResource

import kotlin.test.Test
import kotlin.test.assertEquals

class InteractiveGreetingTest {

    @Test fun makeGreeting() {
        val greeting = InteractiveGreeting(ConstPersonInfo("someone", "somewhere"))
        assertEquals("Hello someone from somewhere!", greeting.makeGreeting())
    }

}

package problemExternalResource

import java.io.BufferedReader
import java.io.StringReader
import kotlin.test.Test
import kotlin.test.assertEquals

class InteractiveGreetingTest {

    @Test fun makeGreeting() {
        val greeting = InteractiveGreeting(BufferedReader(StringReader("someone\nsomewhere\n")), System.out)
        assertEquals("Hello someone from somewhere!", greeting.makeGreeting())
    }

}

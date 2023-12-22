package problemNestedResponsibilities

import kotlin.test.Test
import kotlin.test.assertEquals

class NestedGreetingTest {
    @Test
    fun testBasicGreeting() {
        val greeting = Greeting("Alice")
        assertEquals("Hi Alice", greeting.makeGreeting())
    }

    @Test
    fun testBoldGreeting() {
        val greeting = Greeting("Alice")
        assertEquals("Hi *Alice*", greeting.makeGreeting())
    }

    @Test
    fun testSeveralGreetings() {
        val greeting = Greeting("Alice", "Bob")
        assertEquals("Hi Alice and Bob", greeting.makeGreeting())
    }

    @Test
    fun testSeveralBoldGreetings() {
        val greeting = Greeting("Alice", "Bob")
        assertEquals("Hi *Alice* and *Bob*", greeting.makeGreeting())
    }

    @Test
    fun testBoldSeveralGreetings() {
        val greeting = Greeting("Alice", "Bob")
        assertEquals("Hi *Alice and Bob*", greeting.makeGreeting())
    }

    @Test
    fun testBoldSeveralBoldGreetings() {
        val greeting = Greeting("Alice", "Bob")
        assertEquals("Hi **Alice* and *Bob**", greeting.makeGreeting())
    }

    @Test
    fun testNestedBoldGreetings() {
        val greeting = Greeting("Alice", "Bob")
        assertEquals("Hi **Alice* and Bob* and *Charlie*", greeting.makeGreeting())
    }
}

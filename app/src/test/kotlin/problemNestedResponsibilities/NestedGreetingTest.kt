package problemNestedResponsibilities

import kotlin.test.Test
import kotlin.test.assertEquals

class NestedGreetingTest {
    @Test
    fun testBasicGreeting() {
        val greeting = Greet(Single("Alice"))
        assertEquals("Hi Alice", greeting.makeGreeting())
    }

    @Test
    fun testBoldGreeting() {
        val greeting = Greet(Bold(Single("Alice")))
        assertEquals("Hi *Alice*", greeting.makeGreeting())
    }

    @Test
    fun testSeveralGreetings() {
        val greeting = Greet(And(Single("Alice"), Single("Bob")))
        assertEquals("Hi Alice and Bob", greeting.makeGreeting())
    }

    @Test
    fun testSeveralBoldGreetings() {
        val greeting = Greet(And(Bold(Single("Alice")), Bold(Single("Bob"))))
        assertEquals("Hi *Alice* and *Bob*", greeting.makeGreeting())
    }

    @Test
    fun testBoldSeveralGreetings() {
        val greeting = Greet(Bold(And(Single("Alice"), Single("Bob"))))
        assertEquals("Hi *Alice and Bob*", greeting.makeGreeting())
    }

    @Test
    fun testBoldSeveralBoldGreetings() {
        val greeting = Greet(Bold(And(Bold(Single("Alice")), Bold(Single("Bob")))))
        assertEquals("Hi **Alice* and *Bob**", greeting.makeGreeting())
    }

    @Test
    fun testNestedBoldGreetings() {
        val greeting = Greet(And(Bold(And(Bold(Single("Alice")), Single("Bob"))), Bold(Single("Charlie"))))
        assertEquals("Hi **Alice* and Bob* and *Charlie*", greeting.makeGreeting())
    }
}

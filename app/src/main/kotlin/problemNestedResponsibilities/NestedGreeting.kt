package problemNestedResponsibilities

interface Greeting {
    fun makeGreeting(): String
}

class Single(private val name: String) : Greeting {
    override fun makeGreeting(): String {
        return name
    }
}

class Greet(private val inner: Greeting) : Greeting {
    override fun makeGreeting(): String {
        return "Hi ${inner.makeGreeting()}"
    }
}

class Bold(private val inner: Greeting) : Greeting {
    override fun makeGreeting(): String {
        return "*${inner.makeGreeting()}*"
    }
}

class And(private val first: Greeting, private val second: Greeting) : Greeting {
    override fun makeGreeting(): String {
        return "${first.makeGreeting()} and ${second.makeGreeting()}"
    }
}

fun run() {
    println(Greet(Single("Alice")).makeGreeting())
    println(Greet(And(Bold(Single("Alice")), Single("Bob"))).makeGreeting())
}
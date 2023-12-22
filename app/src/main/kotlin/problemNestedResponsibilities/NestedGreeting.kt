package problemNestedResponsibilities

class Greeting(val name: String, val name2: String? = null) {
    fun makeGreeting(): String {
        // TODO: implement to make tests pass
        return "Hi $name"
    }
}

fun run() {
    println(Greeting("Alice").makeGreeting())
    println(Greeting("Alice", "Bob").makeGreeting())
}
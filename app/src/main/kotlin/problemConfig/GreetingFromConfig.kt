package problemConfig

enum class ConfigMan {
    INSTANCE;

    companion object {
        var someConfig: Int = 3
    }
}
class GreetingFromConfig {
    fun makeGreeting(): String {
        return "Hello World with config ${ConfigMan.someConfig}!"
    }
}

fun run() {
    println(GreetingFromConfig().makeGreeting())
}

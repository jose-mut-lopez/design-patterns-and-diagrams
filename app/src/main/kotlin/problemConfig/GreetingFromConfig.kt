package problemConfig

class ConfigMan {
    var someConfig: Int = 3
}
class GreetingFromConfig(private val config: ConfigMan) {
    fun makeGreeting(): String {
        return "Hello World with config ${config.someConfig}!"
    }
}

fun run() {
    println(GreetingFromConfig(ConfigMan()).makeGreeting())
}

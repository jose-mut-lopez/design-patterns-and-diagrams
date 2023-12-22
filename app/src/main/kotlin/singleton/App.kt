package singleton


enum class ConfigMan {
    INSTANCE;

    companion object {
        var someConfig: Int = 3
    }
}
class App {
    val greeting: String
        get() {
            val someConfig = ConfigMan.someConfig
            return "Hello World with config $someConfig!"
        }
}

fun main() {
    println(App().greeting)
}

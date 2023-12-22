package singleton


enum class ConfigMan {
    INSTANCE;

    companion object {
        fun getSomeConfig(): Int {
            return 3
        }
    }
}
class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}

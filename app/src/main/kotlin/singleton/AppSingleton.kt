package singleton


class ConfigMan {
    var someConfig: Int = 3
}

class AppSingleton(private val config: ConfigMan) {
    val greeting: String
        get() {
            val someConfig = config.someConfig
            return "Hello World with config $someConfig!"
        }
}

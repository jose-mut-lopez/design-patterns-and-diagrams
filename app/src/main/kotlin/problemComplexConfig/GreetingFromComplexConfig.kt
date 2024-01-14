package problemComplexConfig

class StoredParam<T>(var storedValue: T)  {
    override fun toString(): String {
        return storedValue.toString()
    }
}

class ConfigMan {
    var someConfig: StoredParam<Int> = StoredParam(3)
    private var configs: MutableMap<String, StoredParam<Int>> = mutableMapOf(Pair("someConfig", someConfig))

    fun updateConfig() {
        // required feature: being able to loop over all configs, not just access each one by name
        for (config in configs) {
            config.value.storedValue += 1
        }
    }
}


class GreetingFromComplexConfig(private val config: ConfigMan) {

    fun makeGreeting(): String {
        // required feature: being able to access a config by name
        // required feature: use the most recent version of the config when getGreetings is called
        return "Hello World with config ${config.someConfig}!"
    }
    fun updateConfig() {
        config.updateConfig()
    }
}

fun run() {
    val greeting = GreetingFromComplexConfig(ConfigMan())
    println(greeting.makeGreeting())
    greeting.updateConfig()
    println(greeting.makeGreeting())
}

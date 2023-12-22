package problemComplexConfig

class StoredParam<T>(var storedValue: T)  {
    override fun toString(): String {
        return storedValue.toString()
    }
}

enum class ConfigMan {
    INSTANCE;

    companion object {
        var someConfig: StoredParam<Int> = StoredParam(3)
    }
    private lateinit var configs: MutableMap<String, StoredParam<Int>>
    fun initialise() {
        configs = mutableMapOf(Pair("someConfig", ConfigMan.someConfig))
    }

    fun updateConfig() {
        // required feature: being able to loop over all configs, not just access each one by name
        for (config in configs) {
            config.value.storedValue += 1
        }
    }
}

class GreetingFromComplexConfig {

    init {
        ConfigMan.INSTANCE.initialise()
    }
    fun makeGreeting(): String {
        // required feature: being able to access a config by name
        // required feature: use the most recent version of the config when getGreetings is called
        return "Hello World with config ${ConfigMan.someConfig}!"
    }
    fun updateConfig() {
        ConfigMan.INSTANCE.updateConfig()
    }
}

fun run() {
    val greeting = GreetingFromComplexConfig()
    println(greeting.makeGreeting())
    greeting.updateConfig()
    println(greeting.makeGreeting())
}

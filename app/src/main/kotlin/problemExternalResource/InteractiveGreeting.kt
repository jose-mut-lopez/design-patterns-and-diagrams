package problemExternalResource

interface PersonInfo {
    var name: String?
    var location: String?

    fun requestName()
    fun requestLocation()
}

class InteractivePersonInfo : PersonInfo {
    override var name: String? = null
    override var location: String? = null

    override fun requestName() {
        println("What is your name?")
        name = readln()
    }
    override fun requestLocation() {
        println("What is your location?")
        location = readln()
    }
}

class ConstPersonInfo(
    override var name: String?,
    override var location: String?,
) : PersonInfo {
    override fun requestName() {}
    override fun requestLocation() {}
}


class InteractiveGreeting(
    private val personInfo: PersonInfo = InteractivePersonInfo(),
) {
    fun makeGreeting(): String {
        personInfo.requestName()
        personInfo.requestLocation()
        return "Hello ${personInfo.name} from ${personInfo.location}!"
    }
}


fun run() {
    println(InteractiveGreeting().makeGreeting())
}
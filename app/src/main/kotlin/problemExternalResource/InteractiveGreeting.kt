package problemExternalResource

class PersonInfo {
    var name: String? = null
    var location: String? = null

    fun requestName() {
        println("What is your name?")
        name = readln()
    }
    fun requestLocation() {
        println("What is your location?")
        location = readln()
    }
}

class InteractiveGreeting(
) {
    fun makeGreeting(): String {
        val personInfo = PersonInfo()
        personInfo.requestName()
        personInfo.requestLocation()
        return "Hello ${personInfo.name} from ${personInfo.location}!"
    }
}


fun run() {
    println(InteractiveGreeting().makeGreeting())
}
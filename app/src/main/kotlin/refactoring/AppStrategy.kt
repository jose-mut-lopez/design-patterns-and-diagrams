package refactoring

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

class AppStrategy {
    private val personInfo = PersonInfo()
    fun requestData(): String {
        personInfo.requestName()
        personInfo.requestLocation()
        return "Hello ${personInfo.name} from ${personInfo.location}!"
    }
}

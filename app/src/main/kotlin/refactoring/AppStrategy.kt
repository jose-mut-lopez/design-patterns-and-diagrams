package refactoring

import java.io.*

class PersonInfo(
    private val input: BufferedReader,
    private val output: PrintStream,
) {
    var name: String? = null
    var location: String? = null

    fun requestName() {
        output.println("What is your name?")
        name = input.readLine()
    }
    fun requestLocation() {
        output.println("What is your location?")
        location = input.readLine()
    }
}

class AppStrategy(
    input: BufferedReader = BufferedReader(InputStreamReader(System.`in`)),
    output: PrintStream = System.out,
    private val personInfo: PersonInfo = PersonInfo(input, output),
) {
    fun requestData(): String {
        personInfo.requestName()
        personInfo.requestLocation()
        return "Hello ${personInfo.name} from ${personInfo.location}!"
    }
}

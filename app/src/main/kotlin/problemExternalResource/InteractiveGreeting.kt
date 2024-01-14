package problemExternalResource

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintStream

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

class InteractiveGreeting(
    input: BufferedReader = BufferedReader(InputStreamReader(System.`in`)),
    output: PrintStream = System.out,
    private val personInfo: PersonInfo = PersonInfo(input, output),
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
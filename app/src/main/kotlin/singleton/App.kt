/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package singleton

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}

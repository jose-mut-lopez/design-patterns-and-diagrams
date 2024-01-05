package refactoring

fun main() {
    println(AppSingleton(ConfigMan()).greeting)
    println(AppStrategy().requestData())
}
package singleton

fun main() {
    println(AppSingleton(ConfigMan()).greeting)
    println(AppStrategy().requestData())
}
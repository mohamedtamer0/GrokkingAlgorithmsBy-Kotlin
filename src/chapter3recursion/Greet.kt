package chapter3recursion

private fun greet2(name: String) {
    println("how are you, $name?")
}

private fun bye() {
    println("Ok bye!")
}

private fun greet(name: String) {
    println("Hello, $name!")
    greet2(name)
    println("getting ready to say bye..")
    bye()
}


fun main() {
    greet("Tamer")
}
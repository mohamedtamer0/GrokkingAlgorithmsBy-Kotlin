package chapter5hashtables

val voted: HashMap<String, Boolean> = HashMap()

fun main() {
    checkVoter("tom")
    checkVoter("mike")
    checkVoter("mike")
}

private fun checkVoter(name: String) {
    if (voted.containsKey(name)) println("Kick them out!")
    else {
        voted[name] = true
        println("let them voted!")
    }
}
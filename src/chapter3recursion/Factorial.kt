package chapter3recursion

private fun fact(x: Int): Int {
    return if (x == 1) 1 else x * fact(x - 1)
}


fun main() {
    println(fact(5))
}
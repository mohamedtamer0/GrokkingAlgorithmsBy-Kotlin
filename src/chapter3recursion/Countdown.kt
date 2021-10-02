package chapter3recursion

private fun countdown(i: Int) {
    println(i)

    // base case
    if (i <= 0) {
        return
    } else {
        countdown(i - 1)
    }
}


fun main() {
    countdown(5)
}
package chapter1binarysearch

private fun binarySearch(list: IntArray, item: Int): Int? {
    // has to return boxed integer in order to comfort to interface defined in the book
    var low = 0
    var high = list.size - 1
    while (low <= high) {
        val mid = (low + high) / 2
        val guess: Int = list[mid]
        if (guess == item) return mid
        if (guess > item) high = mid - 1 else low = mid + 1
    }
    return null
}

fun main() {
    val myList = intArrayOf(1, 3, 5, 7, 9)
    println(binarySearch(myList, 5)) // 2
    println(binarySearch(myList, -1)) // null
}

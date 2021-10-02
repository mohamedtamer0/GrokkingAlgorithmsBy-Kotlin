package chapter4quicksort


private fun quickSort(list: List<Int>): List<Int> {
    if (list.size < 2) return list
    val pivot = list[0]
    val less = list.filter { it < pivot }
    val greater = list.filter { it > pivot }
    return quickSort(less) + pivot + quickSort(greater)
}

fun main() {
    println(quickSort(listOf(10, 5, 2, 3))) //[2, 3, 5, 10]
}

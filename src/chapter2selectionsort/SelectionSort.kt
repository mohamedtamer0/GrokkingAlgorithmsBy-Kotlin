package chapter2selectionsort


private fun selectionSort(arr: IntArray): List<Int> {

    val newArr = arr.toMutableList()

    fun findSmallest(): Int {

        var smallest = newArr[0]
        var smallestIndex = 0

        for (i in 1 until newArr.size) {
            if (newArr[i] < smallest) smallest = newArr[i]
            smallestIndex = i
        }
        return smallestIndex
    }

    val list = mutableListOf<Int>()
    while (newArr.isNotEmpty()) {
        val smallestIndex = findSmallest()
        list.add(newArr.removeAt(smallestIndex))
    }
    return list
}

fun main() {
    val arr = intArrayOf(5, 3, 6, 2, 10)
    println(selectionSort(arr)) //[2, 3, 5, 6, 10]
}
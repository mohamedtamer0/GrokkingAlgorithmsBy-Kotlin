package chapter_6_Breadth_first_search

import java.util.*
import kotlin.collections.HashSet

fun isPersonSeller(name: String): Boolean =
    name.endsWith("m")

fun main() {

    val graph: HashMap<String, List<String>> = hashMapOf()

    graph["you"] = listOf("alice", "bob", "claire")
    graph["bob"] = listOf("anuj", "peggy")
    graph["alice"] = listOf("peggy")
    graph["claire"] = listOf("thom", "jonny")
    graph["anuj"] = emptyList()
    graph["peggy"] = emptyList()
    graph["thom"] = emptyList()
    graph["jonny"] = emptyList()

    val searchQueue: Deque<String> = ArrayDeque()
    val searched: MutableSet<String> = HashSet()

    searchQueue.addAll(graph["you"]?.asIterable() ?: emptyList())

    while (searchQueue.isNotEmpty()) {
        val person = searchQueue.pop()

        if (!searched.contains(person))
            if (isPersonSeller(person)) {
                println("$person - found a seller!")
                break
            } else {
                searchQueue.addAll(graph[person]?.asIterable() ?: emptyList())
                searched.add(person)
            }

    }
}
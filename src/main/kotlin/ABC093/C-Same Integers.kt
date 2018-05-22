package ABC093

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    var count = 0
    val list = mutableListOf<Triple<Int, Int, Int>>()
    val input = Triple(a, b, c)
    list.add(input)

    list.forEach {i ->
        val first = Triple(i.first + 1, i.second + 1, i.third)
        val second = Triple(i.first + 1, i.second, i.third + 1)
        val third = Triple(i.first, i.second + 1, i.third + 1)
        val forth = Triple(i.first + 2, i.second, i.third)
        val fifth = Triple(i.first, i.second + 2, i.third)
        val sixth = Triple(i.first, i.second, i.third + 2)
        list.add(first)
        list.add(second)
        list.add(third)
        list.add(forth)
        list.add(fifth)
        list.add(sixth)
        count++

        list.forEach {i ->
            if (i.first == i.second && i.second == i.third) {
                println(count)
                return
            }
        }
    }
}
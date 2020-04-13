package ABC116

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val list = mutableListOf<Int>()

    var s = readLine()!!.toInt()
    var count = 2
    list.add(s)

    while (true) {
        if (s % 2 == 0) {
            s /= 2
        } else {
            s = 3 * s + 1
        }

        if (list.contains(s)) {
            println(count)
            return
        }
        list.add(s)
        count++
    }
}
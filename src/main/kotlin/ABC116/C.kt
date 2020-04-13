package ABC116

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    var count = 0
    readLine()!!
    val tall = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    
    while (!tall.all { it == 0 }) {
        //全て0になるまで
        var d = tall.indexOfFirst { it == 0 }
        if (d == -1) {
            d = tall.size
        }
        for (i in 0 until d) {
            tall[i] -= 1
        }
        count ++
    }

    println(count)
}
/*
fun _range(list: MutableList<Int>): IntRange {
    val d = list.indexOfFirst { it == 0 }
    if (d == -1) {
        return 0..d - 1
    } else if (d == 0) {
        val e = list.indexOfLast { it == 0 }
        return e + 1..list.size
    }
}*/
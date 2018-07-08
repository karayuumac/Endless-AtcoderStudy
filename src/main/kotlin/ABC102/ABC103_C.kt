package ABC102

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    readLine()
    val list = readLine()!!.split(" ").map { it.toInt() }
    val endSum = mutableListOf<Int>()
    var count = 1
    list.forEach {
        endSum.add(it - count)
        count++
    }

    val h = Math.floor(endSum.sum().toDouble() / endSum.size).toInt()
    val result = mutableListOf<Int>()

    endSum.forEach {
        result.add(Math.abs(it - h))
    }

    print(result.sum())
}
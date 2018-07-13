package yukicoder.level1_5

/**
 * @author karayuu
 * Not finished
 */
fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    val complexList = mutableListOf<Int>()
    var complex = 0

    for (i in s) {
        when (i) {
            '(' -> complex++
            ')' -> complex--
        }
        complexList.add(complex)
    }

    println(complexList)
    val result = complexList.indexOf(complexList[k - 1])
    println(result)
}
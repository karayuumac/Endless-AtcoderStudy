package dwangoV

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    readLine()!!
    val a = readLine()!!.split(" ").map { it.toInt() }

    val ave = a.average()
    val thumb = a.minBy { Math.abs(it - ave) }!!

    var flame = 0
    for (i in a) {
        if (i == thumb) {
            println(flame)
            return
        } else {
            flame++
        }
    }
}
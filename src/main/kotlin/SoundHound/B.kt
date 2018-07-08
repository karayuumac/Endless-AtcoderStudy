package SoundHound

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val s = readLine()!!
    val w = readLine()!!.toInt()

    var result = ""

    val s_c = s.chunked(w)
    s_c.forEach {
        result += it[0]
    }

    println(result)
}
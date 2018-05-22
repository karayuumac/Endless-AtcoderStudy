package ABC097


/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }


    fun canTalk(a: Int, c: Int, d: Int): Boolean {
        return Math.abs(a - c) <= d
    }

    fun canTalkByQSY(a: Int, b: Int, c: Int, d: Int): Boolean {
        return canTalk(a, b, d) && canTalk(b, c, d)
    }

    if (canTalk(a, c, d) || canTalkByQSY(a, b, c, d)) {
        println("Yes")
    } else {
        println("No")
    }
}
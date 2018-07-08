package SoundHound

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    if (a + b == 15) {
        println("+")
        return
    }
    if (a * b == 15) {
        println("*")
        return
    }

    println("x")
}
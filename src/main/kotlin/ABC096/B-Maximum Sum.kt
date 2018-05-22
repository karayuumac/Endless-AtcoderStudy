package ABC096

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val r = readLine()!!.toInt()
    if (a > b && a > c) {
        println(R(a, r) + b + c)
    } else if (b > a && b > c) {
        println(R(b, r) + a + c)
    } else if (c > a && c > b) {
        println(R(c, r) + b + a)
    } else {
        println(R(a, r) + b + c)
    }
}

fun R(a: Int, r: Int) : Int {
    var result = a
    for (i in 1..r) {
        result *= 2
    }
    return result
}
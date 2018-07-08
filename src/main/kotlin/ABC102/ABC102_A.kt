package ABC102

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    if (a % 2 == 0) {
        print(a)
    } else {
        print(a*2)
    }
}
package AOJ.ITP1

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    var count = 1
    while (true) {
        val x = readLine()!!.toInt()
        if (x == 0) {
            break
        }
        println("Case $count: $x")
        count++
    }
}
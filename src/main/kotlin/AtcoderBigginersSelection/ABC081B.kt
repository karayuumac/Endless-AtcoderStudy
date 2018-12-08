package AtcoderBigginersSelection

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    readLine()
    var input = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var count = 0

    while (input.asSequence().filter { it % 2 == 1 }.count() <= 0) {
        input = input.map { it / 2 }.toMutableList()
        count++
    }

    println(count)
}
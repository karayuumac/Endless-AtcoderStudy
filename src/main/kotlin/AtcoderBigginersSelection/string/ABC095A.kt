package AtcoderBigginersSelection.string

/**
 * Created by karayuu on 2018/12/08
 */
fun main(args: Array<String>) {
    val s = readLine()!!
    var sum = 700

    for (c in s) {
        if (c == 'o') {
            sum += 100
        }
    }

    println(sum)
}

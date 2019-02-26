package AtcoderBigginersSelection.Multiple_decision

/**
 * Created by karayuu on 2018/11/10
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    val mul = a * b

    if (mul % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}

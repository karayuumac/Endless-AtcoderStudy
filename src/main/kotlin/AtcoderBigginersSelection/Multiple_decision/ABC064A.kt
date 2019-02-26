package AtcoderBigginersSelection.Multiple_decision

/**
 * Created by karayuu on 2018/12/08
 */
fun main(args: Array<String>) {
    val (r, g, b) = readLine()!!.split(" ").map { it.toInt() }
    val num = r * 100 + g * 10 + b //ポイントはここ。位取り記数法で変換する

    if (num % 4 == 0) {
        println("YES")
    } else {
        println("NO")
    }
}

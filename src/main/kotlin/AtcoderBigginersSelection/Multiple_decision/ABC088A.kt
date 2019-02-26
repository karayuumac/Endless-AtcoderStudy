package AtcoderBigginersSelection.Multiple_decision

/**
 * Created by karayuu on 2018/12/08
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.toInt()

    if (n % 500 <= a) {
        //500は無限に払えるので、端数が払えるかどうか確認する
        println("Yes")
    } else {
        println("No")
    }
}

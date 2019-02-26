package AtcoderBigginersSelection.string

/**
 * Created by karayuu on 2018/12/08
 */
fun main(args: Array<String>) {
    val s = readLine()!!
    val count = s.length - 2
    println("${s[0]}$count${s[s.length - 1]}")
}

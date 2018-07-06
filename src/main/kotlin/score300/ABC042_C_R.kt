package score300

/**
 * Created by karayuu on 2018/07/03
 */
fun main(args: Array<String>) {
    var (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val dislikeNums = readLine()!!.split(" ")
    var n_s = n.toString().map { it.toString() }

    /* .none{}で指定された要素を含まないとき(.filter{}.isEmpty()と同じ)にtrueを返す */
    /* whileはtrueの間ループを回すので、含まなくなった->falseにするために真偽値を反転 */
    while (!n_s.none { dislikeNums.contains(it) }) {
        n++
        n_s = n.toString().map { it.toString() }
    }

    print(n)

}

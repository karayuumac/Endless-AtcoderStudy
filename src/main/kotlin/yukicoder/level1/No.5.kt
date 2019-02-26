package yukicoder.level1

/**
 * Created by karayuu on 2018/12/09
 */
fun main(args: Array<String>) {
    val (l, n) = (0..1).map { readLine()!!.toInt() }
    val boxes = readLine()!!.split(" ").map { it.toInt() }.sorted()

    /*
     * 最大何個入りますか？なので、小さいほうから入れていったほうが多く入る。
     * 小さい順にソートして、小さいほうから入れていく。
     */
    var count = 0
    var sum = 0

    for (i in boxes) {
        sum += i
        if (sum <= l) {
            count++
        } else {
            break
        }
    }
    println(count)
}

package AOJ.ALDS1

/**
 * Created by karayuu on 2019/06/02
 */
fun 最大公約数を求めるユークリッドの互除法(args: Array<String>) {
    var (x, y) = readLine()!!.split(" ").map { it.toInt() }
    if (x < y) {
        val _x = x
        x = y
        y = _x
    }

    while (true) {
        val div = x % y
        if (div == 0) {
            println(y)
            return
        }

        x = y
        y = div
    }
}

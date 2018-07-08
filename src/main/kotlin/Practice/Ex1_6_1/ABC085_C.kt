package Practice.Ex1_6_1

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (n, y) = readLine()!!.split(" ").map { it.toInt() }

    val a = Math.floor(n / 10000.0).toInt()
    if (a == 0) {
        val reslut = calc(n)
    }
}

fun calc(money: Int) : Pair<Int, Int> {
    val b = Math.floor(money / 5000.0).toInt()
    return if (b == 0) {
        if (money % 1000 == 0) {
            Pair(0, money / 1000)
        } else {
            Pair(-1, -1)
        }
    } else {
        val newMoney = money - 5000 * b
        if (newMoney % 1000 == 0) {
            Pair(b, newMoney / 1000)
        } else {
            Pair(-1, -1)
        }
    }
}
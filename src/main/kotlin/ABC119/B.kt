package ABC119

/**
 * Created by karayuu on 2019/02/24
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    var btc = 0.0
    var money = 0

    for (i in 1..n) {
        val (k, s) = readLine()!!.split(" ")
        if (s == "JPY") {
            money += k.toInt()
        } else {
            btc += k.toDouble()
        }
    }

    println(btc * 380000 + money)
}

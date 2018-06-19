package JOI2017_2018

/**
 * Created by karayuu on 2018/06/06
 */
fun main(args: Array<String>) {
    val (n, a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }

    //Aで買ったとき
    val aSum = ceilDivision(n, a) * b
    //Bで買ったとき
    val bSum = ceilDivision(n, c) * d

    print(minOf(aSum, bSum))
}

fun ceilDivision(a: Int, b: Int) = Math.ceil(a.toDouble() / b.toDouble()).toInt()

fun minOf(a: Int, b: Int) = if (a <= b) a else b

package ABC099

/**
 * Created by karayuu on 2018/06/10
 */
fun main(args: Array<String>) {
    var a = readLine()!!.toInt()
    var c = 0

    a - (a / pow(9, 5)) * pow(9, 5)
    c += a / pow(9, 5)
    check(a, c)
    a - (a / pow(6, 6) * pow(6, 6))
    c += (a / pow(6, 6))
    check(a, c)

}

fun pow(a: Int, b: Int) : Int = Math.pow(a.toDouble(), b.toDouble()).toInt()

fun check (a: Int, c: Int) {
    if (a == 0) print(c)
}

package ABC101

/**
 * Created by karayuu on 2018/06/23
 */
fun main(args: Array<String>) {
    val s = readLine()!!
    print(s.count { it == '+' } - s.count { it == '-' })
}

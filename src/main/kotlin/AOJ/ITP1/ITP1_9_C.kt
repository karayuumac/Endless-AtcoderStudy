package AOJ.ITP1

/**
 * Created by karayuu on 2019/05/23
 */
fun main(args: Array<String>) {
    val count = readLine()!!.toInt()
    var taro_point = 0
    var hanako_point = 0

    for (i in 1..count) {
        val (taro, hanako) = readLine()!!.split(" ")
        when {
            taro < hanako -> hanako_point += 3
            taro == hanako -> {
                taro_point += 1
                hanako_point += 1
            }
            else -> taro_point += 3
        }
    }
    println("$taro_point $hanako_point")
}

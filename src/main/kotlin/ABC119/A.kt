package ABC119

/**
 * Created by karayuu on 2019/02/24
 */
fun main(args: Array<String>) {
    val day = readLine()!!
    val (y, m, d) = day.split("/").map { it.toInt() }

    if (y <= 2019 && m <= 4 && d <= 30) {
        println("Heisei")
    } else {
        println("TBD")
    }
}

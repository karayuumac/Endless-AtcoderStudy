package AOJ.ITP1

/**
 * Created by karayuu on 2019/05/23
 */
fun main(args: Array<String>) {
    while (true) {
        var string = readLine()!!
        if (string == "-") {
            return
        }
        val count = readLine()!!.toInt()
        for (i in 1..count) {
            val h = readLine()!!.toInt()
            val lower = string.take(h)
            val upper = string.drop(h)

            string = upper + lower
        }
        println(string)
    }
}

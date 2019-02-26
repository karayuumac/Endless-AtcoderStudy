package ABC115

/**
 * Created by karayuu on 2018/12/08
 */
fun main(args: Array<String>) {
    val count = readLine()!!.toInt()
    val items = mutableListOf<Int>()
    (1..count).forEach {
        val s = readLine()!!.toInt()
        items.add(s)
    }

    val max = items.max()!!
    val sum = items.sum()

    println(sum - max + max / 2)
}

package ABC115

/**
 * Created by karayuu on 2018/12/08
 */
fun main(args: Array<String>) {
    val (k, n) = readLine()!!.split(" ").map { it.toInt() }
    val trees = mutableListOf<Int>()
    (1..k).forEach {
        trees.add(readLine()!!.toInt())
    }

    val interval = mutableListOf<Int>()
    for (i in 0..trees.size - 2) {
        interval.add(Math.abs(trees[i] - trees[i + 1]))
    }

    println(interval.min())
}

package ABC102

/**
 * @author karayuu
 */
fun main(array: Array<String>) {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }

    print(list.max()!! - list.min()!!)
}
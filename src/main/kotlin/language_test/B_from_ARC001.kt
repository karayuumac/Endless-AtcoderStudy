package language_test

/**
 * Created by karayuu on 2018/10/07
 */
fun main(args: Array<String>) {
    readLine()
    val input = readLine()!!.split("")

    val one = input.asSequence().filter { it == "1" }.count()
    val two = input.asSequence().filter { it == "2" }.count()
    val three = input.asSequence().filter { it == "3" }.count()
    val four = input.asSequence().filter { it == "4" }.count()

    val checkList = listOf(one, two, three, four)

    println("${checkList.max()} ${checkList.min()}")
}

package ABC091

import kotlin.math.abs

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val blueList = (1..readLine()!!.toInt()).map { readLine()!! }

    val redList = (1..readLine()!!.toInt()).map { readLine()!! }

    val check = blueList.distinct().toMutableList() + redList.distinct()
    val yen = check.map { check ->
        blueList.filter { it == check }.count() - redList.filter { it == check }.count()
    }.max()!!

    println(
            if (yen <= 0) 0 else yen
    )
}
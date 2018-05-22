package score200


/**
 * Created by karayuu on 2018/05/22
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }

    /* #roundToInt()で四捨五入->平均を出す。平均にそろえるのが最もコストが少ない...と思う */
    val average = Math.round(list.average()).toInt()

    val cost = list.sumBy { (it - average).squared() }

    print(cost)
}

fun Int.squared() : Int = this * this

/* kotlin 1.0.0 は#roundToInt()がないので作るしかない... -> Mathクラスを使うのが楽。*/

fun Double.roundToInt() : Int = Math.round(this).toInt()


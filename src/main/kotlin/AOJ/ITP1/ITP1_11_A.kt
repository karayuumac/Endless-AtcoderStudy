package AOJ.ITP1

/**
 * Created by karayuu on 2019/06/02
 */
fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map { it.toInt() }
    val dice = Dice(a[0], a[1], a[2], a[3], a[4], a[5])
    val dir = readLine()!!
    dir.forEach {
        dice.roll(it)
    }
    println(dice.a)
}

class Dice(
        var a: Int,
        var b: Int,
        var c: Int,
        var d: Int,
        var e: Int,
        var f: Int
) {
    fun roll(direction: Char) {
        when (direction) {
            'N' -> {
                a = b
                b = f
                f = e
                e = a
            }

            'E' -> {
                a = d
                d = f
                f = c
                c = a
            }

            'S' -> {
                a = e
                e = f
                f = b
                b = a
            }

            'W' -> {
                a = c
                c = f
                f = d
                d = a
            }
        }
    }
}

package Practice.Ex1_6_1

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val point_map = mutableListOf<Point>()
    (1..n).forEach {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        point_map.add(Point(x, y))
    }
    var max = 0.0

    /* 最大で入力は100個。つまり考えなければいけないのは100 C 2 = 4950通り。forで回して間に合う。 */
    for (i in 0 until point_map.size) {
        for (j in i + 1 until point_map.size) {
            val a_p = point_map[i]
            val b_p = point_map[j]
            max = kotlin.math.max(calc(a_p.x, a_p.y, b_p.x, b_p.y), max)
        }
    }

    println(max)
}

fun calc(x_1: Int, y_1: Int, x_2: Int, y_2: Int) : Double {
    val dif_x = Math.abs(x_2.toDouble() - x_1.toDouble())
    val dif_y = Math.abs(y_2.toDouble() - y_1.toDouble())
    return Math.sqrt(dif_x * dif_x + dif_y * dif_y)  //.round(4)
}

/*
fun Double.round(digit: Int) : Double {
    val decimal = BigDecimal(this)
    return decimal.setScale(digit, BigDecimal.ROUND_HALF_UP).toDouble()
}
*/

/*
fun max(a: Double, b: Double) : Double {
    return if (a >= b) {
        a
    } else {
        b
    }
}
*/

data class Point(val x: Int, val y: Int)
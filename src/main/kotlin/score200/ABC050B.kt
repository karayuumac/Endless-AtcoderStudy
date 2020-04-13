package score200

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  readLine()!!
  val t = readLine()!!.split(" ").map { it.toInt() }
  val m = readLine()!!.toInt()
  (1..m).forEach {
    val (pi, xi) = readLine()!!.split(" ").map { it.toInt() }
    println(cal(t, pi, xi))
  }
}

fun cal(t: List<Int>, pi: Int, xi: Int) =
        t.sum() - t[pi - 1] + xi
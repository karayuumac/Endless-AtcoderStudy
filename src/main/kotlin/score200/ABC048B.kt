package score200

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  val (a, b, x) = readLine()!!.split(" ").map { it.toLong() }
  println(f(b, x) - f(a - 1, x))
}

fun f(x: Long, n: Long) = if (x == -1L) {
  0
} else {
  x / n + 1
}
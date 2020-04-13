package ABC133

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
  val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
  val r1 =  n * a
  if (r1 >= b) {
    println(b)
  } else {
    println(r1)
  }
}
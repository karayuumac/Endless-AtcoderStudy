package AOJ.ICPC

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  val (a, b, x) = readLine()!!.split(" ").map { it.toInt() }
  val r1 = f(x, 500) * b
  val r2 = f(x, 1000) * a
  val r3 = f(x - 1000 * (x / 1000), 500) * 500 + a * (x / 1000)
  println(l(r1, l(r2, r3)))
}

fun f(x: Int, y: Int) : Int {
  val a = x % y
  val b = x / y
  return if (a != 0) {
    b + 1
  } else {
    b
  }
}

fun l(a: Int, b: Int) : Int {
  return if (a > b) b else a
}
package AOJ.ALDS1

import java.lang.Integer.max

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  val n = readLine()!!.toInt()
  val r = mutableListOf<Int>()
  (1..n).forEach { _ ->
    r.add(readLine()!!.toInt())
  }

  var nmax = r[1] - r[0]

  for (j in 1 until n) {
    for (i in 0 until j) {
      nmax = max(nmax, r[j] - r[i])
    }
  }

  println(nmax)
}
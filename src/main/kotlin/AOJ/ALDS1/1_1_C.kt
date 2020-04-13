package AOJ.ALDS1

import java.lang.Math.floor
import java.lang.Math.sqrt

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  val n = readLine()!!.toInt()
  var count = 0
  (1..n).forEach {
    if (素数かどうか判定(readLine()!!.toInt())) {
      count++
    }
  }

  println(count)
}

fun 素数かどうか判定(x: Int): Boolean {
  if (x == 2) return true
  if (x < 2 || x % 2 == 0) return false
  for (i in 3..floor(sqrt(x.toDouble())).toInt()) {
    if (x % i == 0) {
      return false
    }
  }
  return true
}
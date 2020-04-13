package score200

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
  val n = readLine()!!
  var x = 0
  var max = 0
  val s = readLine()!!

  s.forEach {
    when (it) {
      'I' -> x++
      'D' -> x--
    }
    max = Math.max(max, x)
  }

  println(max)
}

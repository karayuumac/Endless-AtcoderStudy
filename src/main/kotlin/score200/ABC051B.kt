package score200

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  var count = 0
  val (k, s) = readLine()!!.split(" ").map { it.toInt() }
  for (x in 0..k) {
    for (y in 0..k) {
      val _z = s - x - y
      if (_z in 0..k) {
        count++
      }
    }
  }

  println(count)
}
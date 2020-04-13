package AOJ.ALDS1

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  val n = readLine()!!.toInt()
  val a = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
  for (i in 1 until n) {
    val v = a[i]
    var j = i - 1
    while (j >= 0 && a[j] > v) {
      a[j + 1] = a[j]
      j--
    }
    a[j + 1] = v
  }
}
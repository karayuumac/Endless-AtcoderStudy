package score200

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  val s = readLine()!!

  val a_pos = s.indexOfFirst { it == 'A' }
  val z_pos = s.indexOfLast { it == 'Z' }

  println(z_pos - a_pos + 1)
}
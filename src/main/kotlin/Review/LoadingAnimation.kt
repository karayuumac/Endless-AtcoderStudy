package Review

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  
}

private fun decoration(i: Int): String {
  when (i % 4) {
    0 -> return "｜"
    1 -> return "／"
    2 -> return "ー"
    3 -> return "＼"
  }
  return ""
}
package AOJ.PCK_Prelim._2017

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
  //読み込む
  val (a, b) = readLine()!!.split(" ").map { it.toInt() }
  /**
   * 問題文より,(a + b) / 2を出力すれば良いことがわかる.
   * 条件から,2で割ったときに余りが出ることはない.
   */
  println((a + b) / 2)
}
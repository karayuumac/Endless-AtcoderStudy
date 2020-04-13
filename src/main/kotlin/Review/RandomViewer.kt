package Review

import java.util.*

/**
 * @author karayuu
 */
fun main() {
  //Randomクラスを作成
  val random = Random()
  //乱数生成
  val a = (1..1000).map { random.nextInt(19) + 1 }
  //数値出力
  a.forEach {
    print("$it ")
  }
  //計上
  for (i in 1..19) {
    val percentage = a.filter { it == i }.count().toDouble() / 1000
    println("${String.format("%2s", i)}の出た割合は${percentage}です。")
  }
}
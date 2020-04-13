package AOJ.PCK_Prelim._2018

/**
 * Created by karayuu on 2019/06/17
 */
fun main(args: Array<String>) {
  var (A, B, x) = readLine()!!.split(" ").map { it.toInt() }
  if (x % 500 != 0) {
    //500の倍数に切り上げる
    x += (500 - x % 500)
  }

  /**
   * 1000mLが500mLより安かったら,1000mLを多く使う方が良い
   * 500mL * 2が1000mLより安かったら,500mLを多く使う方が良い
   * それ以外は1000mLを限界まで使って,500mLを残りで払えば良い
   */
  //1000mLを買う個数
  var a = 0
  //500mLを買う個数
  var b = 0

  if (A < B) {
    //1000mLを限界まで買う
    a = x / 1000
    //余ってたらもう一本買う
    if (x % 1000 > 0) {
      a++
    }
  } else if (A > B * 2) {
    b = x / 500
    //xは500の倍数にしているので,これが余ることはない
  } else {
    //1000mLで限界まで買って,500mLを残り買う
    a = x / 1000
    x %= 1000
    b = x / 500
  }

  //出力
  println(A * a + B * b)
}
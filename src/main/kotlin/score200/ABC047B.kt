package score200

/**
 * Created by karayuu on 2018/06/05
 */
fun main(args: Array<String>) {
  val (width, height, N) = readLine()!!.split(" ").map { it.toInt() }
  val array = Array(width + 1) { BooleanArray(height + 1) } /* 2次元配列 */

  for (i in 1..N) {
    val (x, y, n) = readLine()!!.split(" ").map { it.toInt() }
    when (n) {
      1 -> {
        for (j in 0 until x) {
          for (k in 0..height) {
            array[j][k] = true
          }
        }
      }

      2 -> {
        for (j in x + 1 ..width) {
          for (k in 0..height) {
            array[j][k] = true
          }
        }
      }

      3 -> {
        for (j in 0..width) {
          for (k in 0 until y) {
            array[j][k] = true
          }
        }
      }

      4 -> {
        for (j in 0..width) {
          for (k in y+1..height) {
            array[j][k] = true
          }
        }
      }
    }
  }

  var count = 0
  for (i in 0..width) {
    for (j in 0..height) {
      if (!array[i][j]) {
        count++
      }
    }
  }

  println(count)
}

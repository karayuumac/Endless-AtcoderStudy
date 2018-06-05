package score200

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }

    print(k * pow(k - 1, n - 1))
}

fun pow(a: Int, b: Int) : Int = Math.pow(a.toDouble(), b.toDouble()).toInt()

/*
  1つ目はk色で塗れる。その先はk-1(隣の色を除く)で塗れるから
  k * (k - 1)^(n - 1)
 */
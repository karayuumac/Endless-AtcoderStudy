package DP

import kotlin.math.max

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    /* 通常パターン */
    /*
    val a = readLine()!!.split(" ").map { it.toInt() }
    val ans = a.filter { it > 0 }.sum()
    print(ans)
    */
    print(DP())
}

fun DP(): Int{
    /* 動的計画法(DP) */
    /*
    dp[0]->何も取らない
    dp[1]->0番目までの整数(a[0])の中から整数を選んで総和をとった時の最大値
    dp[2]->1番めまでの整数(a[0],a[1])の中から整数を選んで総和をとった時の最大値
    dp[i+1]->i番目までの整数(a[0],a[1], ... a[i])の中から整数を選んで総和をとった時の最大値
    とおくと,求めたいのはi = n-1の時(a[0],a[1]...a[n-1])つまりdp[n]
    iとi+1の関係はdp[i]でa[0]...a[i-1]までの中から整数を選んで総和をとった時の最大値を求めているから,
    a[i]を選ぶか選ばないかの2通りで考える。
    選ぶ->dp[i+1] = dp[i] + a[i]
    選ばない->dp[i+1] = dp[i]
    このうちの最大値をdp[i+1]とすればいいから,
    dp[i+1] = max(dp[i] + a[i], dp[i]) (dp[0] = 0)
     */
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val dp = intArrayOf(n + 10)

    dp[0] = 0
    for (i in 0 until n) {
        dp[i + 1] = max(dp[i] + a[i], dp[i])
    }

    return dp[n]
}
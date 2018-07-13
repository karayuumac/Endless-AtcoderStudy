package DP

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    /*
    dp[i+1]:i番目までの品物の中からWを超えないように選んだ時の価値の総和の最大値
    dp[i+1] = dp[i] + (w[i], p[i]を加えるか否か)..重さについての情報がないので,加えられるかの判断がつかない。

    dp[i+1][w]:i番目までの商品の中から,wを超えないように選んだ時の価値の総和の最大値
    dp[i][w]がわかっているとすると,
    dp[i+1][w] = dp[i][w-w[i]] + p[i] (w >= w[i]の時)
               = dp[i][w] (w < w[i]の時)

     */
}
package DFS

/**
 * Created by karayuu on 2018/10/07
 */
fun main(args: Array<String>) {
    val size = 2
    var count = 0

    fun dfs(x: Int, y: Int) {
        /* 終了条件 */
        if (x == size && y == size) {
            count++
            return
        }

        /* yがsizeよりも小さかったら,1個増やせるはず */
        if (y < size) {
            /* yを増やして再計算 */
            dfs(x, y + 1)
        }

        /* 上のyと同様 */
        if (x < size) {
            dfs(x + 1, y)
        }
    }

    dfs(0, 0) //初期値
    println(count)
}

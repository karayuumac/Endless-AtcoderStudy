package ABC119

/**
 * Created by karayuu on 2019/02/24
 */
fun main(args: Array<String>) {
    val (n, A, B, C) = readLine()!!.split(" ").map { it.toInt() }
    val l = arrayOfNulls<Int>(n)
    for (i in 0 until n) {
        l[i] = readLine()!!.toInt()
    }

    /*
    fun dfs(depth: Int, a: Int, b: Int, c: Int): Int {
        if (depth == n) {
            //深さがnつまりn本に関しての評価が終わったということなので、MP計算。
            //
        }
    }
    */
}



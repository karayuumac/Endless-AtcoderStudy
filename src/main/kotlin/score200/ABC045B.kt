package score200

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    /* String.ToList()でList<Char>に1文字ずつ格納する */
    val (a, b, c) = (1..3).map { readLine()!!.toList() }

    var (a_s, b_s, c_s) = (1..3).map { 0 }
    var whoPlay = 'a'

    while (true) {
        if (a_s == a.size - 1 || b_s == b.size - 1 || c_s == c.size - 1) break
        when (whoPlay) {
            'a' -> {
                a_s++
                whoPlay = a[a_s]
            }

            'b' -> {
                b_s++
                whoPlay = b[b_s]
            }

            'c' -> {
                c_s++
                whoPlay = c[c_s]
            }
        }
    }

    print(whoPlay.toUpperCase())
}
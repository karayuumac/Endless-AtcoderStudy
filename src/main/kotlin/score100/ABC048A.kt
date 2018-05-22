package score100

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ")

    /* 下手なことせず頭文字をとって並べるのが楽 */
    print(a[0].toString() + b[0].toString() + c[0].toString())
}
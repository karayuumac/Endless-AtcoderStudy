package score100

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    /* Setは重複を許さないことを利用すると良い */
    val s = readLine()!!.split(" ").toSet()
    print(s.size)
}
package score100

/**
 * Created by karayuu on 2019/06/17
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ")
    if (a == "H") {
        println(b)
    } else {
        if (b == "H") {
            println("D")
        } else {
            println("H")
        }
    }
}

package ABC092

import java.util.*

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val train_standard = scanner.nextInt()
    val train_endless = scanner.nextInt()

    val bus_standard = scanner.nextInt()
    val bus_endless = scanner.nextInt()

    var sum = 0

    fun returnSmallOne(first: Int, second: Int): Int {
        return if (first < second) {
            first
        } else {
            second
        }
    }

    sum += returnSmallOne(train_standard, train_endless)
    sum += returnSmallOne(bus_standard, bus_endless)

    println(sum)
}
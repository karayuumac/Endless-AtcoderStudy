package library

/**
 * @author karayuu
 */

/**
 * [a]^[b]([a]の[b]乗)を返します。
 *
 * return the [a] to the [b]th power.
 */
fun pow(a: Int, b: Int) : Int = Math.pow(a.toDouble(), b.toDouble()).toInt()

fun String.chunked(range: Int) : List<String> {
    
}
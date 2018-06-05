package score200

/**
 * @author karayuu
 */

fun main(args:Array<String>) {
    val map = mutableMapOf<Char, MutableList<Char>>()

    ('a'..'c').map { map[it] = readLine()!!.toMutableList() }

    var whoPlay = 'a'

    while (true) {
        val stock = map[whoPlay]!!
        if (stock.size == 0) {
            print(whoPlay.toUpperCase())
            break
        }

        whoPlay = stock[0]
        stock.removeAt(0)
    }
}
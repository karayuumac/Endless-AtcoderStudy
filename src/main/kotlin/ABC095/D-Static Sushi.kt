package ABC095

/**
 * @author karayuu
 */

fun main (args:Array<String>) {

    fun canEat(round: Int, nextDistance: Int, nextCal: Int): Boolean {
        val dis_min = mutableListOf(nextDistance, round - nextDistance).min()!!

        return nextCal < dis_min
    }
}
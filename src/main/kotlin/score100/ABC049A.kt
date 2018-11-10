package score100

/**
 * Created by karayuu on 2018/10/06
 */
fun main(args: Array<String>) {
    val checkList = listOf('a', 'e', 'i', 'o', 'u')

    val c = readLine()!!.toCharArray().first()

    if (checkList.contains(c)) {
        println("vowel")
    } else {
        println("consonant")
    }
}

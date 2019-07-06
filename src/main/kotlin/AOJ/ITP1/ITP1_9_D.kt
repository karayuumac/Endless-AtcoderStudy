package AOJ.ITP1

/**
 * Created by karayuu on 2019/05/23
 */
fun main(arg: Array<String>) {
    var word = readLine()!!
    val q = readLine()!!.toInt()

    (1..q).forEach {
        val args = readLine()!!.split(" ")

        val action = args[0]
        val a = args[1]
        val b = args[2]
        when (action) {
            "replace" -> {
                word = word.replaceRange(a.toInt(), b.toInt() + 1, args[3])
            }

            "reverse" -> {
                word = word.replaceRange(a.toInt(), b.toInt() + 1,
                        word.subSequence(a.toInt(), b.toInt() + 1).reversed())
            }

            "print" -> {
                println(word.subSequence(a.toInt(), b.toInt() + 1))
            }
        }
    }
}

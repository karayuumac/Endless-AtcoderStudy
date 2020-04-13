package yukicoder.level1

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val s = readLine()!!
    println(s.toReverseCase())
}

/**
 * 文字列を大文字だったら小文字に、小文字だったら大文字に変換します.
 */
fun String.toReverseCase() : String {
    val list = this.toList()
    var new = ""

    list.forEach { c ->
        new += if (c.isUpperCase()) {
            c.toLowerCase()
        } else {
            c.toUpperCase()
        }
    }

    return new
}
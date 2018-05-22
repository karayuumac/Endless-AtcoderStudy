package score200

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    var string = ""
    val command = readLine()!!

    (0 until command.length).forEach {
        when (command[it].toString()) {
            "0" -> string += "0"
            "1" -> string += "1"
            /* .dropLast(n) : 後ろからn文字消去できる。再代入しなくてはならないことに注意。 */
            "B" -> string = string.dropLast(1)
        }
    }

    print(string)
}
package score200

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val string = readLine()!!
    /* 文字数を保存しておくリスト */
    val list = mutableListOf<Int>()

    /* aからzまでの文字数をカウントしてlistに格納 */
    ('a'..'z').forEach { character ->
        list.add(string.count { it == character })
    }

    if (list.isEven()) print("Yes") else print("No")
}

/**
 * 入力された[MutableList<Int>の要素が全て偶数かどうかを返します。
 *
 * Return whether all elements of imputed [MutableList<Int>] are even.
 */
fun MutableList<Int>.isEven() : Boolean {
    for (j in this) {
        if (!j.isEven()) return false
    }
    return true
}

fun Int.isEven() : Boolean = this % 2 == 0
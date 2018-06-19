package ABC099

/**
 * Created by karayuu on 2018/06/10
 */
fun main(args: Array<String>) {
    var a = readLine()!!.toInt()
    var c = 0
    val test = mutableListOf<Int>()

     if (a % 59049 == 0) test.add((a / 59049))
     if (a % 46656 == 0) test.add(a / 46656)
     if (a % 7776 == 0) test.add(a / 7776)
     if (a % 6561 == 0) test.add(a / 6561)
     if (a % 1296 == 0) test.add(a / 1296)
     if (a % 729 == 0) test.add(a / 729)
     if (a % 216 == 0) test.add(a / 216)
     if (a % 81 == 0) test.add(a / 81)
     if (a % 36 == 0) test.add(a / 36)
     if (a % 9 == 0) test.add(a / 9)
     if (a % 6 == 0) test.add(a / 6)

    while (a > 0) {
        when {
            a >= 59049 -> {
                a -= 59049
                c++
            }
            a >= 46656 -> {
                a -= 46656
                c++
            }
            a >= 7776 -> {
                a -= 7776
                c++
            }
            a >= 6561 -> {
                a -= 6561
                c++
            }
            a >= 1296 -> {
                a -= 1296
                c++
            }
            a >= 729 -> {
                a -= 729
                c++
            }
            a >= 216 -> {
                a -= 216
                c++
            }
            a >= 81 -> {
                a -= 81
                c++
            }
            a >= 36 -> {
                a -= 36
                c++
            }
            a >= 9 -> {
                a -= 9
                c++
            }
            a >= 6 -> {
                a -= 6
                c++
            }
            else -> {
                c += a
                a = 0
            }
        }
    }

    when {
        test.isEmpty() -> print(c)
        test.min()!! <= c -> print(test.min()!!)
        else -> print(c)
    }
}

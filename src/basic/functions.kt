package basic

/**
 * 関数について
 */

fun main(args: Array<String>) {
    result("succ ${succ(31)}")
    hello()
    hello("yusuke!")

    sum(1, 2, 3)
    //可変長引数に配列を渡す時は*をつけてコンパイラが認識できるようにする
    sum(*intArrayOf(1, 2, 3))
    val ints: IntArray = intArrayOf(2, 3, 4)
    sum(*ints)

    //
    sumSaiki(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
}

fun result(mes: String) {
    print("${mes} \n")
}

fun succ(i: Int): Int = i + 1

fun square(i: Int): Int = i * i

fun max(a: Int, b: Int): Int = if (b <= a) a else b

/**
 * デフォルト引数をとることが可能
 */
fun hello(name: String = "world") {
    result("Hello, ${name}")
}

/**
 * 可変長引数
 * varargを書くだけで引数が可変的に取れる
 * 可変長引数は配列として扱われる
 *
 * caution!可変長引数は一つの関数について1つまでしか持てない！
 */
fun sum(vararg ints: Int): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

/**
 * 再帰呼び出し
 */
fun sumSaiki(nums: List<Long>): Long =
        if (nums.isEmpty()) 0
        // list.dro(n)
        // リストの先頭からn個の要素を除いた部分リスト
        else nums.first() + sumSaiki(nums.drop(1))



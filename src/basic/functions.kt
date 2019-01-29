package basic

/**
 * 関数について
 */

fun main(args : Array<String>) {
    result("succ ${succ(31)}")
}

fun result(mes : String) {
    print("${mes} \n")

}

fun succ(i : Int): Int = i + 1

fun square(i : Int): Int = i * i

fun max(a : Int, b : Int): Int = if (b <= a) a else b

package week1

fun main() {

    val arr1 = intArrayOf(9)

    println(plusOne(arr1).contentToString())

}

fun plusOne(digits: IntArray): IntArray {

    val s1 = digits.joinToString("")
    val num = (s1.toBigInteger() + 1.toBigInteger()).toString()

    val arr  = num.map { it.digitToInt() }.toIntArray()

    return arr
}


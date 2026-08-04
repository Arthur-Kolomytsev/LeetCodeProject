package org.example.week1

fun main() {

    val s = "OP"

    println(isPalindrome(s))

}

fun isPalindrome(s: String): Boolean {
    val s1 = s.filter { it.isLetterOrDigit() }.lowercase()
    val s2 = s1.reversed()

    return s1.equals(s2)
}
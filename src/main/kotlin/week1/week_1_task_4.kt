package org.example.week1

fun main() {

    val s = "anagram"
    val t = "nagaram"

    println(isAnagram(s, t))

}

fun isAnagram(s: String, t: String): Boolean {
    val list1 = s.toList().sorted()
    val list2 = t.toList().sorted()

    if (list1 == list2) {
        return true
    } else return false
}
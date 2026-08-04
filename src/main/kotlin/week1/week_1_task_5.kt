package org.example.week1

fun main() {

    val s = "   fly me   to   the moon  "

    println(lengthOfLastWord(s))

}

fun lengthOfLastWord(s: String): Int {
    val list = s.trim().split(" ")
    return list.last().length
}


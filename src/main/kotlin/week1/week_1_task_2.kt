package org.example.week1

fun main() {

    fun isPalindrome(x: Int): Boolean {
        val list1 = x.toString().toList()
        val list2 = list1.reversed()

        return list1 == list2
    }

    println(isPalindrome(10))

}
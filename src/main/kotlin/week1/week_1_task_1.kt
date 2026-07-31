package org.example.week1

fun main() {

    fun fizzBuzz(n: Int): List<String> {

        val answer = mutableListOf<String>()

        for (i in 1..n) {
            when {
                i % 15 == 0 -> answer.add("FizzBuzz")
                i % 3 == 0 -> answer.add("Fizz")
                i % 5 == 0 -> answer.add("Buzz")
                else -> answer.add(i.toString())
            }

        }
        return answer

    }

    println(fizzBuzz(15))

}
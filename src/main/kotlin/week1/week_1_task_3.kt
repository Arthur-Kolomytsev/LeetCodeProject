package org.example.week1

fun main() {

    val arr = listOf("flower", "f", "flow", "flight", "flight", "fl2").toTypedArray()
    val result = longestCommonPrefix(arr)

    println(result)

}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]
    for (i in 1 until strs.size) {
        prefix = prefix.commonPrefixWith(strs[i])
        if (prefix.isEmpty()) break

    }
    return prefix
}
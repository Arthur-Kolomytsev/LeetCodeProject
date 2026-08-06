package week1

fun main() {

    val nums = intArrayOf(3, 5, 1, 4, -8)
    val target = 5

    val result = intArrayOf(0, 0)


    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                result[0] = i
                result[1] = j
            }
        }

    }

    println(result.contentToString())
}
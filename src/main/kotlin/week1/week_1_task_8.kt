package week1

fun main() {

    val nums = arrayOf(1, 1, 1, 1, 1)
    var curr = 0

    for (i in 0 until nums.size) {
        nums[i] = nums[i] + curr
        curr = nums[i]
    }

    println(nums.contentToString())

}


package week1

fun main() {

    val nums = intArrayOf(0, 0, 0, 1, 0, 4)

    println(nums.contentToString())

    moveZeroes(nums)
    println(nums.contentToString())

}

fun moveZeroes(nums: IntArray): Unit {

    var j = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            nums[j] = nums[i].also { nums[i] = nums[j] }
            j++
        }
    }
}





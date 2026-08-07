package week1

fun main() {

    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

    println(removeDuplicates(nums))

}

fun removeDuplicates(nums: IntArray): Int {

    if (nums.isEmpty()) return 0

    var k = 1

    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i]
            k++
        }
    }
    return k
}

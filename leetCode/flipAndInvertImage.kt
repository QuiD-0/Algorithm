fun main() {
    println(
        Solution().flipAndInvertImage(
            arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0)
            )
        )
    )
}

class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        for (i in image.indices) {
            image[i] = image[i].reversedArray()
            for (j in image[i].indices) {
                image[i][j] = image[i][j] xor 1
            }
        }

        return image
    }
}
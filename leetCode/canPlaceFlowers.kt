fun main() {
    Solution()
        .canPlaceFlowers(intArrayOf(1, 0, 0, 0, 0, 1), 2)
        .also(::println)
}

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var plants = n
        var idx = 0

        while (idx < flowerbed.size && plants > 0) {
            if (flowerbed[idx] == 0 && (idx == 0 || flowerbed[idx - 1] == 0) && (idx == flowerbed.size - 1 || flowerbed[idx + 1] == 0)) {
                idx += 2
                plants--
            } else {
                idx++
            }
        }

        return plants <= 0
    }
}
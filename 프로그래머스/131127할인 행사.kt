class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var count = 0
        val DAY = 10
        val size = discount.size
        val hash = HashMap<String, Int>()
        want.forEachIndexed { index, s ->
            hash[s] = number[index]
        }
        for (i in 0 ..size - DAY){
            val list = discount.slice(i until i + DAY)
            val map = mutableMapOf<String,Int>()
            list.forEach {
                map[it] = map.getOrDefault(it, 0) + 1
            }
            if (hash == map){
                count ++
            }
        }
        return count
    }
}

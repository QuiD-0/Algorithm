fun main() {
    println(
        Solution().solution(
            arrayOf("covy -", "teo covy", "felix teo", "vex covy"),
            123
        )
    )
}

class Solution {
    fun solution(members: Array<String>, p: Int): Array<String> {
        val recommend: MutableMap<String, String> = members.map { it.split(" ") }.associate { it[0] to it[1] }.toMutableMap()
        val pointMap: MutableMap<String, Int> = members.map { it.split(" ") }.associate { it[0] to 0 }.toMutableMap()
        val sortInfo = members.map { it.split(" ") }.mapIndexed { index, s -> s[1] to index }.toMap()
        members.forEach{ s ->
            var (_, parent) = s.split(" ")
            var point = p
            while(parent != "-") {
                pointMap[parent] = pointMap.getOrDefault(parent, 0) + point
                parent = recommend[parent]!!
                point = (point * 0.1).toInt()
            }
        }
        return pointMap.toList().sortedWith(compareBy({ -it.second }, { sortInfo[it.first] })).map { "${it.first} ${it.second}" }.toTypedArray()
    }
}

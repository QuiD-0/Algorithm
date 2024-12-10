fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val visit = Array(rooms.size) { false }
        val keys = ArrayDeque<Int>()

        keys.add(0)

        while(keys.isNotEmpty()) {
            val key = keys.removeFirst()
            if (visit[key]) {
                continue
            }
            visit[key] = true
            rooms[key].forEach {
                keys.add(it)
            }
        }
        return visit.all { it }
    }
}
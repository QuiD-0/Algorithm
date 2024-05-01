import kotlin.math.max

fun main() {
    println(Solution())
}

//class Solution {
//    fun solution(money: Int, stocks: Array<LongArray>): Long {
//        val dp = Array(stocks.size + 1) { LongArray(money + 1) }
//        for (i in 1..stocks.size) {
//            for (j in 1..money) {
//                dp[i][j] = dp[i - 1][j]
//                if (j >= stocks[i - 1][1]) {
//                    dp[i][j] = max(dp[i][j], dp[i - 1][j - stocks[i - 1][1].toInt()] + stocks[i - 1][0])
//                }
//            }
//        }
//        return dp[stocks.size][money]
//    }
//}

//class Solution {
//    fun solution(orderAmount: Long, taxFreeAmount: Long, serviceFee: Long): Long {
// orderAmount : 주문금액
// taxFreeAmount : 비과세금액
// serviceFee : 봉사료
//        val tax = 0.1
//        val taxAmount = orderAmount - taxFreeAmount - serviceFee
//        if (taxAmount == 1L) return 0
//        return Math.ceil(taxAmount * tax).toLong()
//    }
//}


//class Solution {
//    fun solution(servers: Int, sticky: Boolean, requests: IntArray): Array<IntArray> {
//        var answer: Array<IntArray> = arrayOf<IntArray>()
//        val serverList = Array(servers) { mutableListOf<Int>() }
//        if (sticky) {
//            var serverIndex = 0
//            val hashMap = hashMapOf<Int, Int>()
//            requests.forEachIndexed { index, request ->
//                if (index == 0) {
//                    serverList[serverIndex].add(request)
//                    hashMap[request] = serverIndex
//                    serverIndex = (serverIndex + 1) % servers
//                } else {
//                    if (hashMap.containsKey(request)) {
//                        serverList[hashMap[request]!!].add(request)
//                    } else {
//                        serverList[serverIndex].add(request)
//                        hashMap[request] = serverIndex
//                        serverIndex = (serverIndex + 1) % servers
//                    }
//                }
//            }
//        } else {
//            var serverIndex = 0
//            for (request in requests) {
//                serverList[serverIndex].add(request)
//                serverIndex = (serverIndex + 1) % servers
//            }
//        }
//        for (server in serverList) {
//            answer += server.toIntArray().also { println(it.toList()) }
//        }
//        return answer
//    }
//}

//class Solution {
//    fun solution(amountText: String): Boolean {
//        if (amountText == "0") return true
//        return Money(amountText).validate()
//    }
//}
//
//data class Money(val value: String) {
//    fun validate(): Boolean {
//        if (!value.matches(Regex("^[0-9,]*$"))) return false
//        if (value.startsWith("0")) return false
//        if (value.contains(",")) {
//            if (!value.matches(Regex("^\\d{1,3}(,\\d{3})*$"))) return false
//        }
//        return true
//    }
//}

//class Solution {
//    fun solution(s: String): Int {
//        if(s.length < 3) return -1
//        if(s.length == 3) return if(s[0] == s[1] && s[0] == s[2]) s.toInt() else -1
//        var find = -1
//        for (i in 0 until s.length - 2) {
//            if(s[i] == s[i + 1] && s[i] == s[i + 2]){
//                find = max(find, s[i].digitToInt())
//            }
//        }
//
//        return when (find) {
//            -1 -> -1
//            0 -> 0
//            else -> "$find$find$find".toInt()
//        }
//    }
//}

//class Solution {
//    fun solution(levels: IntArray): Int {
//        val len = levels.size
//        if(len < 4) return -1
//        levels.sort()
//        val idx = len - len / 4
//
//        return levels[idx]
//    }
//}
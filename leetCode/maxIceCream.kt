fun main() {
    println(Solution().maxIceCream(intArrayOf(1,3,2,4,1),7))
}

class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        var count =0
        var coin = coins
        costs.sorted().forEach {
            if(coin-it >=0){
                count+=1
                coin-=it
            }
        }
        return count
    }
}
fun main() {
    println(
        Solution().solution(
            arrayOf("sofa red long", "blanket blue long", "towel red", "mattress long", "curtain blue long cheap"),
            arrayOf("towel", "mattress", "curtain")
        )
    )
}

class Solution {
    fun solution(products: Array<String>, purchased: Array<String>): String {
        val productMap = products.map { Product(it) }
        val purchasedMap = productMap.filter { it.name in purchased }
        val recommendTable: MutableMap<String,Int> = mutableMapOf()
        purchasedMap.forEach { product ->
            product.args.forEach { arg ->
                recommendTable[arg] = recommendTable.getOrDefault(arg, 0) + 1
            }
        }
        val sortedRecommendTable = recommendTable.toList().sortedWith(compareBy({ -it.second }, { it.first }))
        val size = sortedRecommendTable.size
        val recommendData = sortedRecommendTable.filter { it.first !in purchased }.mapIndexed { index, pair -> Triple(pair.first, pair.second, size-index)}
        val remain = productMap.filter { it.name !in purchased }
        val result = remain.associate { it.name to 0 }.toMutableMap()
        for (product in remain) {
            product.args.forEach { arg ->
                recommendData.forEach { (name, _, score) ->
                    if (arg == name) {
                        result[product.name] = result.getOrDefault(product.name, 0) + score
                    }
                }
            }
        }
        val sortedResult = result.toList().sortedWith(compareBy({ -it.second }, { it.first }))
        return sortedResult[0].first
    }

    data class Product(val name:String, val args: List<String>){
        constructor(str: String): this(str.split(" ")[0], str.split(" ").subList(1, str.split(" ").size))
    }
}
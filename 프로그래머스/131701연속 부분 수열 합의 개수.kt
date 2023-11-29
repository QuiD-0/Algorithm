fun solution(elements: IntArray): Int {
    val powList = (elements+elements).toList()
    val len = elements.size
    val set = mutableSetOf<Int>()
    for (i in elements.indices){
        for (j in 1..len){
            powList.subList(i, i+j)
                .let { set.add(it.sum()) }
        }
    }
    return set.size
}
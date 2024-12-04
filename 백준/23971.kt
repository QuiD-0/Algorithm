import kotlin.math.ceil

fun main() {
    val (H, W, N, M) = readln().split(" ").map { it.toInt() }

    val h = ceil(H.toDouble() / (N + 1)).toInt()
    val w = ceil(W.toDouble() / (M + 1)).toInt()
    print(w * h)
}

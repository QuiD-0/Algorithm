class Solution {

    fun encode(longUrl: String): String {
        return Base64.getEncoder().encodeToString(longUrl.toByteArray())
    }

    fun decode(shortUrl: String): String {
        return String(Base64.getDecoder().decode(shortUrl))
    }
}
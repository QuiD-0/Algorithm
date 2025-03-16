internal class Solution {
    fun solution(S: String, C: String): String {
        val names = S.split(", ")
        val email = C.toLowerCase()
        val result = StringBuilder()
        val usedEmails = mutableMapOf<String, Int>()

        for (name in names) {
            val nameParts = name.split(" ")
            val size = nameParts.size
            var frontInitial = ""
            for (i in 0 until size - 1) {
                frontInitial += nameParts[i][0]
            }
            val lastName = nameParts[nameParts.size - 1].replace("-", "").take(8)
            val emailName = "$frontInitial${lastName}".toLowerCase()
            if (usedEmails.contains(emailName)) {
                val count = usedEmails[emailName]!! + 1
                usedEmails[emailName] = count
                result.append("$name <${emailName}${count}@${email}.com>, ")
            } else {
                usedEmails[emailName] = 1
                result.append("$name <${emailName}@${email}.com>, ")
            }
        }

        return result.toString().substring(0, result.length - 2)
    }
}

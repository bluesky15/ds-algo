internal object Main {
    // Function to find out the minimum number of deletions required to
    // convert a given string `X[i…j]` into a palindrome
    fun minDeletions(X: String, i: Int, j: Int): Int {
        // base condition
        if (i >= j) {
            return 0
        }

        // if the last character of the string is the same as the first character
        return if (X[i] == X[j]) {
            minDeletions(X, i + 1, j - 1)
        } else 1 + Math.min(minDeletions(X, i, j - 1), minDeletions(X, i + 1, j))

        // otherwise, if the last character of the string is different from the
        // first character

        // 1. Remove the last character and recur for the remaining substring
        // 2. Remove the first character and recur for the remaining substring

        // return 1 (for remove operation) + minimum of the two values
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val X = "ACBCDBAA"
        val n = X.length
        print(
            "The minimum number of deletions required is " +
                    minDeletions(X, 0, n - 1)
        )
    }
}
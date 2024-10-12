class Solution:
    def isMatch(self, text, pattern):
        self.memo = {}
        return self.dp(0, 0, text, pattern)

    def dp(self, i, j, text, pattern):
        if (i, j) in self.memo:
            return self.memo[(i, j)] == 'TRUE'

        ans = False
        if j == len(pattern):
            ans = i == len(text)
        else:
            first_match = (i < len(text) and
                           (pattern[j] == text[i] or
                            pattern[j] == '.'))

            if j + 1 < len(pattern) and pattern[j + 1] == '*':
                ans = (self.dp(i, j + 2, text, pattern) or
                       (first_match and self.dp(i + 1, j, text, pattern)))
            else:
                ans = first_match and self.dp(i + 1, j + 1, text, pattern)

        self.memo[(i, j)] = 'TRUE' if ans else 'FALSE'
        return ans
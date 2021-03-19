def check(str_):
    p, m = 0, 0
    ch = [0] * 26
    for i in str_:
        ch[ord(i) - 65] += 1
        
    for d in range(26):
        if dp[d] > ch[d]:
            p += dp[d] - ch[d]
        else:
            m += ch[d] - dp[d]
    
    if p < 2 and m < 2:
        return True
    
    return False

dp = [0] * 26
S = []
for _ in range(int(input())):
    S.append(input())

for s in S[0]:
    dp[ord(s) - 65] += 1

ans = 0
for str1 in S[1:]:
    if check(str1):
        ans += 1
print(ans)
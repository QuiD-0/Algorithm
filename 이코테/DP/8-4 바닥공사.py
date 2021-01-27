n=int(input())
dp=[1]*(n+3)
dp[2]=3
for i in range(3,n+1):
    dp[i]=dp[i-2]*2+dp[i-1]
print(dp[n])


''' 
백준 1793 - 테스트 케이스가 계속 입력 될때 try/except

dp = [1 for i in range(251)]
while(True):
    try:
        n = int(input())
        dp[2] = 3
        for i in range(3,n+1):
            dp[i] = dp[i - 1] + 2 * dp[i - 2]
        print(dp[n])
    except:
        break

'''
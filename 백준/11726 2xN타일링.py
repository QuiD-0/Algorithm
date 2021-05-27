n=int(input())
dp=[1]*(n+3)
dp[0]=0
dp[2]=2
for i in range(3,n+1):
    dp[i]=(dp[i-2]+dp[i-1])
print(dp[n]%10007)
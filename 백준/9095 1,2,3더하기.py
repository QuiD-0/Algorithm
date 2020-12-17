x=int(input())
a=[int(input()) for _ in range(x)]
dp=[0]*11
print(a,dp)
dp[0]=1
dp[1]=2
dp[2]=4
for i in range(3,11):
    dp[i]=dp[i-1]+dp[i-2]+dp[i-3]

for i in a:
    print(dp[i-1])

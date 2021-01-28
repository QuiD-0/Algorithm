n,target=map(int,input().split())
coin=[int(input()) for _ in range(n)]
dp=[-1]*(target+max(coin)+1)
for i in coin:
    dp[i]=1
for i in range(1,target+1):
    if dp[i]!=-1:
        for j in coin:
            if dp[i+j]==-1:
                dp[i+j]=dp[i]+1
            else:
                dp[i+j]=min(dp[i]+1,dp[i+j])
print(dp[target])
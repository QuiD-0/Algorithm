x=int(input())
a=list(map(int,input().split()))
dp=[1 for _ in range(x)]
for i in range(1,x):
    for j in range(i):
        if a[i]>a[j]:
            dp[i]=max(dp[j]+1,dp[i])
print(max(dp))
    

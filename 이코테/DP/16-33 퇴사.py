n=int(input())
arr=[list(map(int,input().split())) for _ in range(n)]
dp=[0]*(n+2)
for idx,(t,p) in enumerate(arr,1):
    if idx+t<=n+1:
        dp[idx+t]=max(arr[idx-1][1]+max(dp[:idx+1]),dp[idx+t])
print(max(dp))


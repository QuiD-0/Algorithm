t=int(input())
for _ in range(t):
    n=int(input())
    arr=list(map(int,input().split()))
    dp=[arr[0]]*n
    for i in range(1,n):
        dp[i]=max(arr[i]+dp[i-1],arr[i])
    print(max(dp))
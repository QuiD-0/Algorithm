t=int(input())
for _ in range(t):
    a=int(input())
    dp=[1]*(a+1)
    for i in range(a+1):
        if i <2:
            dp[i]=1
        elif i==2:
            dp[i]=2
        elif i==3:
            dp[i]=4
        else:
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3]+dp[i-4]
    print(dp[-1])        
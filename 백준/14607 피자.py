def find(n):
    for i in range(2,n):
        a=i//2
        b=i-a
        dp[i]=a*b+dp[a]+dp[b]

n = int(input())
dp=[0]*(n+1)
dp[0]=0
dp[1]=1
find(n)
print(dp[n-1])


'''
#쉬운 정답
i=int(input())
print(i*(i-1)//2)
'''
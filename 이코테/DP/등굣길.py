def solution(m, n, puddles):
    dp=[[0]*(n+1) for _ in range(m+1)]
    for i in range(1,m+1):
        for j in range(1,n+1):
            if [i,j] in puddles:
                dp[i][j]=0
            else:
                if [i,j]==[1,1]:
                    dp[i][j]=1
                else:
                    dp[i][j]=dp[i][j-1]+dp[i-1][j]
    return dp[m][n]%1000000007
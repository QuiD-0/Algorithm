loop=int(input())
for _ in range(loop):
    n,m=map(int,input().split())
    arr=[i for i in list(map(int,input().split()))]
    mat=[]
    for i in range(n):
        mat.append(arr[i*m:i*m+m])
    for i in range(1,m):
        for j in range(n):
            if j!=0 and j!=n-1:
                mat[j][i]+=max(mat[j-1][i-1],mat[j][i-1],mat[j+1][i-1])
            if j==0:
                mat[j][i]+=max(mat[j][i-1],mat[j+1][i-1])
            if j==n-1:
                mat[j][i]+=max(mat[j-1][i-1],mat[j][i-1])
    ans=0
    for i in mat:
        ans=max(i[-1],ans)
    print(ans)



    

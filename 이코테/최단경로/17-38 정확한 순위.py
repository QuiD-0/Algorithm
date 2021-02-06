n,m=map(int,input().split())
graph=[[10000]*(n+1) for _ in range(n+1)]
for _ in range(m):
    a,b=map(int,input().split())
    graph[a][b]=1
for i in range(1,n+1):
    graph[i][i]=0
for k in range(1,1+n):
    for i in range(1,1+n):
        for j in range(1,1+n):
            graph[i][j]=min(graph[i][k]+graph[k][j],graph[i][j])
result=0
for i in range(1,1+n):
    count=0
    for j in range(1,1+n):
        if graph[i][j] != 10000:
            count+=1
    if count==n:
        result +=1
print(result)
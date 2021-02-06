n,v=map(int,input().split())
graph = [[10000] * (n + 1) for _ in range(n + 1)]
for _ in range(v):
    a,b=map(int,input().split())
    graph[a][b]=1
    graph[b][a]=1
for i in range(n+1):
    graph[i][i]=0
x,k=map(int,input().split())
#플루이드 위셜 알고리즘
for k in range(1,1+n):
    for i in range(1,1+n):
        for j in range(1,1+n):
            graph[i][j]=min(graph[i][j],graph[i][k]+graph[k][j])
dis=graph[1][k]+graph[k][x]
print(dis if dis<10000 else -1)
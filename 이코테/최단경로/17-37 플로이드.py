n=int(input())
m=int(input())
graph=[[100001000010000]* n for _ in range(n)]
for i in range(m):
    a,b,c=map(int,input().split())
    graph[a-1][b-1]=min(c,graph[a-1][b-1])
for i in range(n):
    graph[i][i]=0
for k in range(n):
    for i in range(n):
        for j in range(n):
            graph[i][j]=min(graph[i][j],graph[i][k]+graph[k][j])
for i in range(n):
    for j in range(n):
        if graph[i][j]>=100001000010000:
            graph[i][j]="0"
        else:
            graph[i][j]=str(graph[i][j])
for i in graph:
    print(' '.join(i))
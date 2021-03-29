import sys
sys.setrecursionlimit(10000)
def diffuse(x,y):
    global n,m
    mat[x][y]=0
    dxdy=[[1,0],[-1,0],[0,1],[0,-1]]
    for i in range(4):
        dx,dy=x+dxdy[i][0],y+dxdy[i][1]
        if dx>=0 and dx<n and dy>=0 and dy<m and mat[dx][dy]==1:
            diffuse(dx,dy)

t=int(input())
for _ in range(t):
    n,m,c=map(int,input().split())
    mat=[[0 for _ in range(m)] for _ in range(n)]
    ans=0
    for _ in range(c):
        a,b=map(int,input().split())
        mat[a][b]=1
    for i in range(n):
        for j in range(m):
            if mat[i][j]==1:
                diffuse(i,j)
                ans+=1
    print(ans)
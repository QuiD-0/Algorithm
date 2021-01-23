'''
연구소
사용한 자료구조: DFS, 완전탐색
시간 복잡도: O(n^m)
'''
import sys

#바이러스 확산
def diffusion(x,y):
        if x<0 or x>=len(temp) or y<0 or y>=len(temp[0]) or temp[x][y]==1 or temp[x][y]==3:
            return 0
        # 기존 바이러스2로 감염시 무한감염이 발생해서 3으로 감염
        temp[x][y]=3
        #4방향으로 재귀
        diffusion(x+1,y)
        diffusion(x,y+1)
        diffusion(x-1,y)
        diffusion(x,y-1)

#벽 세운뒤 바이러스 확산
def dfs(count):
    global ans
    #벽이 3개 다 있을경우
    if count==3:
        #원본맵 유지를 위한 복사
        for i in range(n):
            for j in range(m):
                temp[i][j]=matrix[i][j]
        # 바이러스 확산
        for i in range(n):
            for j in range(m):
                if temp[i][j]==2:
                    diffusion(i,j)
        #안전구역 카운트
        safe=0
        for i in range(n):
            for j in range(m):
                if temp[i][j]==0:
                    safe+=1
        ans=max(ans,safe)
    #벽세우기
    else:
        for i in range(n):
            for j in range(m):
                if matrix[i][j]==0:
                    matrix[i][j]=1
                    dfs(count+1)
                    matrix[i][j]=0

n,m= map(int,input().split())
matrix=[]
ans=-sys.maxsize
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
temp=[[0]*m for _ in range(n)]
for i in range(n):
    matrix.append([int(i) for i in input().split()])
dfs(0)
print(ans)

